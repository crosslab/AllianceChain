package com.crosslab.blockchain.socket.handler.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.core.ChannelContext;

import com.crosslab.blockchain.ApplicationContextProvider;
import com.crosslab.blockchain.block.YLBlock;
import com.crosslab.blockchain.block.check.YLCheckerManager;
import com.crosslab.blockchain.socket.base.AbstractBlockHandler;
import com.crosslab.blockchain.socket.body.RpcBlockBody;
import com.crosslab.blockchain.socket.body.RpcCheckBlockBody;
import com.crosslab.blockchain.socket.packet.BlockPacket;
import com.crosslab.blockchain.socket.pbft.VoteType;
import com.crosslab.blockchain.socket.pbft.msg.VotePreMsg;
import com.crosslab.blockchain.socket.pbft.queue.MsgQueueManager;

/**
 * 收到请求生成区块消息，进入PrePre队列
 *
 * @author crosslab wrote on 2018/3/12.
 */
public class GenerateBlockRequestHandler extends AbstractBlockHandler<RpcBlockBody> {
    private Logger logger = LoggerFactory.getLogger(GenerateBlockRequestHandler.class);


    @Override
    public Class<RpcBlockBody> bodyClass() {
        return RpcBlockBody.class;
    }

    @Override
    public Object handler(BlockPacket packet, RpcBlockBody rpcBlockBody, ChannelContext channelContext) {
        YLBlock block = rpcBlockBody.getBlock();
        logger.info("收到来自于<" + rpcBlockBody.getAppId() + "><请求生成Block>消息，block信息为[" + block + "]");

        YLCheckerManager yLCheckerManager = ApplicationContextProvider.getBean(YLCheckerManager.class);
        //对区块的基本信息进行校验，校验通过后进入pbft的Pre队列
        RpcCheckBlockBody rpcCheckBlockBody = yLCheckerManager.check(block);
        logger.info("校验结果:" + rpcCheckBlockBody.toString());
        if (rpcCheckBlockBody.getCode() == 0) {
            VotePreMsg votePreMsg = new VotePreMsg();
            votePreMsg.setBlock(block);
            votePreMsg.setVoteType(VoteType.PREPREPARE);
            votePreMsg.setNumber(block.getBlockHeader().getNumber());
            votePreMsg.setAppId(rpcBlockBody.getAppId());
            votePreMsg.setHash(block.getHash());
            votePreMsg.setAgree(true);
            //将消息推入PrePrepare队列
            ApplicationContextProvider.getBean(MsgQueueManager.class).pushMsg(votePreMsg);
        }

        return null;
    }
}
