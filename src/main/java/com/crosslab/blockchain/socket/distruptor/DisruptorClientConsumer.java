package com.crosslab.blockchain.socket.distruptor;

import cn.hutool.core.util.StrUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.tio.utils.json.Json;

import com.crosslab.blockchain.common.AppId;
import com.crosslab.blockchain.socket.base.AbstractBlockHandler;
import com.crosslab.blockchain.socket.body.BaseBody;
import com.crosslab.blockchain.socket.distruptor.base.BaseEvent;
import com.crosslab.blockchain.socket.distruptor.base.MessageConsumer;
import com.crosslab.blockchain.socket.handler.client.FetchBlockResponseHandler;
import com.crosslab.blockchain.socket.handler.client.NextBlockResponseHandler;
import com.crosslab.blockchain.socket.handler.client.TotalBlockInfoResponseHandler;
import com.crosslab.blockchain.socket.packet.BlockPacket;
import com.crosslab.blockchain.socket.packet.PacketType;

import java.util.HashMap;
import java.util.Map;

/**
 * 所有server发来的消息都在这里处理
 * @author crosslab wrote on 2018/4/20.
 */
@Component
public class DisruptorClientConsumer implements MessageConsumer {
    private static Map<Byte, AbstractBlockHandler<?>> handlerMap = new HashMap<>();
    private Logger logger = LoggerFactory.getLogger(getClass());

    static {
        handlerMap.put(PacketType.TOTAL_BLOCK_INFO_RESPONSE, new TotalBlockInfoResponseHandler());
        handlerMap.put(PacketType.NEXT_BLOCK_INFO_RESPONSE, new NextBlockResponseHandler());
        handlerMap.put(PacketType.FETCH_BLOCK_INFO_RESPONSE, new FetchBlockResponseHandler());
    }

    @Override
    public void receive(BaseEvent baseEvent) throws Exception {
        BlockPacket blockPacket = baseEvent.getBlockPacket();
        Byte type = blockPacket.getType();
        AbstractBlockHandler<?> blockHandler = handlerMap.get(type);
        if (blockHandler == null) {
            return;
        }

        //消费消息
        BaseBody baseBody = Json.toBean(new String(blockPacket.getBody()), BaseBody.class);
        logger.info("收到来自于<" + baseBody.getAppId() + ">针对msg<" + baseBody.getResponseMsgId() + ">的回应");

        String appId = baseBody.getAppId();
        if (StrUtil.equals(AppId.value, appId)) {
            //是本机，不做处理
            //return;
        }

        blockHandler.handler(blockPacket, baseEvent.getChannelContext());
    }
}
