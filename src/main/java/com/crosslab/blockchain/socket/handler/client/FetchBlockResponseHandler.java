package com.crosslab.blockchain.socket.handler.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.core.ChannelContext;
import org.tio.utils.json.Json;

import com.crosslab.blockchain.ApplicationContextProvider;
import com.crosslab.blockchain.block.YLBlock;
import com.crosslab.blockchain.block.check.YLCheckerManager;
import com.crosslab.blockchain.core.event.AddBlockEvent;
import com.crosslab.blockchain.socket.base.AbstractBlockHandler;
import com.crosslab.blockchain.socket.body.RpcBlockBody;
import com.crosslab.blockchain.socket.body.RpcCheckBlockBody;
import com.crosslab.blockchain.socket.client.PacketSender;
import com.crosslab.blockchain.socket.packet.BlockPacket;
import com.crosslab.blockchain.socket.packet.NextBlockPacketBuilder;
import com.crosslab.blockchain.socket.pbft.queue.NextBlockQueue;

/**
 * 对方根据我们传的hash，给返回的block
 *
 * @author crosslab wrote on 2018/3/16.
 */
public class FetchBlockResponseHandler extends AbstractBlockHandler<RpcBlockBody> {
    private Logger logger = LoggerFactory.getLogger(TotalBlockInfoResponseHandler.class);

    @Override
    public Class<RpcBlockBody> bodyClass() {
        return RpcBlockBody.class;
    }

    @Override
    public Object handler(BlockPacket packet, RpcBlockBody rpcBlockBody, ChannelContext channelContext) {
        logger.info("收到来自于<" + rpcBlockBody.getAppId() + ">的回复，Block为：" + Json.toJson(rpcBlockBody));

        YLBlock block = rpcBlockBody.getBlock();
        //如果为null，说明对方也没有该Block
        if (block == null) {
            logger.info("对方也没有该Block");
        } else {
            //此处校验传过来的block的合法性，如果合法，则更新到本地，作为next区块
        	if(ApplicationContextProvider.getBean(NextBlockQueue.class).pop(block.getHash()) == null) return null;
        	
            YLCheckerManager yLCheckerManager = ApplicationContextProvider.getBean(YLCheckerManager.class);
            RpcCheckBlockBody rpcCheckBlockBody = yLCheckerManager.check(block);
            //校验通过，则存入本地DB，保存新区块
            if (rpcCheckBlockBody.getCode() == 0) {
                ApplicationContextProvider.publishEvent(new AddBlockEvent(block));
                //继续请求下一块
                BlockPacket blockPacket = NextBlockPacketBuilder.build();
                ApplicationContextProvider.getBean(PacketSender.class).sendGroup(blockPacket);
            }
        }

        return null;
    }
}
