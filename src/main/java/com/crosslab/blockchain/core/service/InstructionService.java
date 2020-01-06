package com.crosslab.blockchain.core.service;

import cn.hutool.core.bean.BeanUtil;

import org.springframework.stereotype.Service;

import com.crosslab.blockchain.block.YLInstruction;
import com.crosslab.blockchain.block.YLInstructionReverse;
import com.crosslab.blockchain.block.YLOperation;
import com.crosslab.blockchain.common.CommonUtil;
import com.crosslab.blockchain.common.Sha256;
import com.crosslab.blockchain.common.TrustSDK;
import com.crosslab.blockchain.common.exception.TrustSDKException;
import com.crosslab.blockchain.core.requestbody.InstructionBody;

/**
 * 一条指令的service
 *
 * @author crosslab wrote on 2018/3/7.
 */
@Service
public class InstructionService {
    /**
     * 校验公私钥是不是一对
     *
     * @param instructionBody
     *         instructionBody
     * @return boolean
     * @throws TrustSDKException
     *         TrustSDKException
     */
    public boolean checkKeyPair(InstructionBody instructionBody) throws TrustSDKException {
        return TrustSDK.checkPairKey(instructionBody.getPrivateKey(), instructionBody.getPublicKey());
    }

    /**
     * 校验内容的合法性
     * @param instructionBody instructionBody
     * @return true false
     */
    public boolean checkContent(InstructionBody instructionBody) {
        byte operation = instructionBody.getOperation();
        if (operation != YLOperation.ADD && operation != YLOperation.DELETE && operation != YLOperation.UPDATE) {
            return false;
        }
        //不是add时，必须要有id和json和原始json
        return YLOperation.UPDATE != operation && YLOperation.DELETE != operation || 
        		instructionBody.getInstructionId() != null && instructionBody.getJson() != null &&
        		instructionBody.getOldJson() != null;
    }

    /**
     * 根据传来的body构建一条指令
     *
     * @param instructionBody
     *         body
     * @return Instruction
     */
    public YLInstruction build(InstructionBody instructionBody) throws Exception {
        YLInstruction yLInstruction = new YLInstruction();
        BeanUtil.copyProperties(instructionBody, yLInstruction);
        if (YLOperation.ADD == yLInstruction.getOperation()) {
            yLInstruction.setInstructionId(CommonUtil.generateUuid());
        }
        yLInstruction.setTimeStamp(CommonUtil.getNow());
        String buildStr = getSignString(yLInstruction);
        //设置签名，供其他人验证
        yLInstruction.setSign(TrustSDK.signString(instructionBody.getPrivateKey(), buildStr));
        //设置hash，防止篡改
        yLInstruction.setHash(Sha256.sha256(buildStr));

        return yLInstruction;
    }

    private String getSignString(YLInstruction yLInstruction) {
    	return yLInstruction.getOperation() + yLInstruction.getTable() + 
    			yLInstruction.getInstructionId() + 
    			(yLInstruction.getJson() == null ? "" : yLInstruction.getJson());
    }

    /**
     * 根据一个指令，计算它的回滚时的指令。<p>
     * 如add table1 {id:xxx, name:"123"}，那么回滚时就是delete table1 {id:xxx}
     * 如delete table2 id2 oldJson:{id:xxx, name:"123"}，那么回滚时就是add table2 {id:xxx, name:"123"}。
     * 如update table3 id3 json:{id:xxx, name:"123"} oldJson:{id:xxx, name:"456"}
     * 注意，更新和删除时，原来的json都得有，不然没法回滚
     *
     * @param yLInstruction
     *         instruction
     * @return 回滚指令
     */
    public YLInstructionReverse buildReverse(YLInstruction yLInstruction) {
        YLInstructionReverse yLInstructionReverse = new YLInstructionReverse();
        BeanUtil.copyProperties(yLInstruction, yLInstructionReverse);

        if (YLOperation.ADD == yLInstruction.getOperation()) {
            yLInstructionReverse.setOperation(YLOperation.DELETE);
        } else if (YLOperation.DELETE == yLInstruction.getOperation()) {
            yLInstructionReverse.setOperation(YLOperation.ADD);
        }

        return yLInstructionReverse;
    }

    public boolean checkSign(YLInstruction yLInstruction) throws TrustSDKException {
        String buildStr = getSignString(yLInstruction);
        return TrustSDK.verifyString(yLInstruction.getPublicKey(), buildStr, yLInstruction.getSign());
    }

    public boolean checkHash(YLInstruction yLInstruction) {
        String buildStr = getSignString(yLInstruction);
        return Sha256.sha256(buildStr).equals(yLInstruction.getHash());
    }
}
