package com.crosslab.blockchain.core.service;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.crosslab.blockchain.block.YLBlock;
import com.crosslab.blockchain.block.YLBlockHeader;
import com.crosslab.blockchain.block.YLBlockBody;
import com.crosslab.blockchain.block.YLInstruction;
import com.crosslab.blockchain.block.merkle.MerkleTree;
import com.crosslab.blockchain.common.CommonUtil;
import com.crosslab.blockchain.common.Sha256;
import com.crosslab.blockchain.common.exception.TrustSDKException;
import com.crosslab.blockchain.core.manager.DbBlockManager;
import com.crosslab.blockchain.core.manager.PermissionManager;
import com.crosslab.blockchain.core.requestbody.BlockRequestBody;
import com.crosslab.blockchain.socket.body.RpcBlockBody;
import com.crosslab.blockchain.socket.client.PacketSender;
import com.crosslab.blockchain.socket.packet.BlockPacket;
import com.crosslab.blockchain.socket.packet.PacketBuilder;
import com.crosslab.blockchain.socket.packet.PacketType;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author crosslab wrote on 2018/3/8.
 */
@Service
public class BlockService {
    @Resource
    private InstructionService instructionService;
    @Value("${version}")
    private int version;
    @Resource
    private PacketSender packetSender;
    @Resource
    private DbBlockManager dbBlockManager;
    @Resource
    private PermissionManager permissionManager;

    /**
     * 校验指令集是否合法
     *
     * @param blockRequestBody
     *         指令集
     * @return 是否合法，为null则校验通过，其他则失败并返回原因
     */
    public String check(BlockRequestBody blockRequestBody) throws TrustSDKException {
        //TODO 此处可能需要校验publicKey的合法性
        if (blockRequestBody == null || blockRequestBody.getBlockBody() == null || StrUtil.isEmpty(blockRequestBody
                .getPublicKey())) {
            return "请求参数缺失";
        }
        List<YLInstruction> yLInstructions = blockRequestBody.getBlockBody().getInstructions();
        if (CollectionUtil.isEmpty(yLInstructions)) {
            return "指令信息不能为空";
        }

        for (YLInstruction yLInstruction : yLInstructions) {
            if (!StrUtil.equals(blockRequestBody.getPublicKey(), yLInstruction.getPublicKey())) {
                return "指令内公钥和传来的公钥不匹配";
            }
            if (!instructionService.checkSign(yLInstruction)) {
                return "签名校验不通过";
            }
            if (!instructionService.checkHash(yLInstruction)) {
                return "Hash校验不通过";
            }
        }

        if (!permissionManager.checkPermission(yLInstructions)) {
            return "权限校验不通过";
        }

        return null;
    }

    /**
     * 添加新的区块
     * @param blockRequestBody blockRequestBody
     * @return Block
     */
    public YLBlock addBlock(BlockRequestBody blockRequestBody) {
        YLBlockBody yLBlockBody = blockRequestBody.getBlockBody();
        List<YLInstruction> yLInstructions = yLBlockBody.getInstructions();
        List<String> hashList = yLInstructions.stream().map(YLInstruction::getHash).collect(Collectors
                .toList());

        YLBlockHeader yLBlockHeader = new YLBlockHeader();
        yLBlockHeader.setHashList(hashList);

        //计算所有指令的hashRoot
        yLBlockHeader.setHashMerkleRoot(new MerkleTree(hashList).build().getRoot());
        yLBlockHeader.setPublicKey(blockRequestBody.getPublicKey());
        yLBlockHeader.setTimeStamp(CommonUtil.getNow());
        yLBlockHeader.setVersion(version);
        yLBlockHeader.setNumber(dbBlockManager.getLastBlockNumber() + 1);
        yLBlockHeader.setHashPreviousBlock(dbBlockManager.getLastBlockHash());
        
        YLBlock block = new YLBlock();
        block.setBlockBody(yLBlockBody);
        block.setBlockHeader(yLBlockHeader);
        block.setHash(Sha256.sha256(yLBlockHeader.toString() + yLBlockBody.toString()));

        BlockPacket blockPacket = new PacketBuilder<>().setType(PacketType.GENERATE_BLOCK_REQUEST).setBody(new
                RpcBlockBody(block)).build();

        //广播给其他人做验证
        packetSender.sendGroup(blockPacket);

        return block;
    }

}
