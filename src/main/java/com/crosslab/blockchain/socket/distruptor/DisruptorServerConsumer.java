package com.crosslab.blockchain.socket.distruptor;

import org.springframework.stereotype.Component;

import com.crosslab.blockchain.socket.base.AbstractBlockHandler;
import com.crosslab.blockchain.socket.distruptor.base.BaseEvent;
import com.crosslab.blockchain.socket.distruptor.base.MessageConsumer;
import com.crosslab.blockchain.socket.handler.server.*;
import com.crosslab.blockchain.socket.packet.BlockPacket;
import com.crosslab.blockchain.socket.packet.PacketType;

import java.util.HashMap;
import java.util.Map;

/**
 * 所有client发来的消息都在这里处理
 * @author crosslab wrote on 2018/4/20.
 */
@Component
public class DisruptorServerConsumer implements MessageConsumer {

    private static Map<Byte, AbstractBlockHandler<?>> handlerMap = new HashMap<>();

    static {
        handlerMap.put(PacketType.GENERATE_COMPLETE_REQUEST, new GenerateCompleteRequestHandler());
        handlerMap.put(PacketType.GENERATE_BLOCK_REQUEST, new GenerateBlockRequestHandler());
        handlerMap.put(PacketType.TOTAL_BLOCK_INFO_REQUEST, new TotalBlockInfoRequestHandler());
        handlerMap.put(PacketType.FETCH_BLOCK_INFO_REQUEST, new FetchBlockRequestHandler());
        handlerMap.put(PacketType.HEART_BEAT, new HeartBeatHandler());
        handlerMap.put(PacketType.NEXT_BLOCK_INFO_REQUEST, new NextBlockRequestHandler());
        handlerMap.put(PacketType.PBFT_VOTE, new PbftVoteHandler());
    }

    @Override
    public void receive(BaseEvent baseEvent) throws Exception {
        BlockPacket blockPacket = baseEvent.getBlockPacket();
        Byte type = blockPacket.getType();
        AbstractBlockHandler<?> handler = handlerMap.get(type);
        if (handler == null) {
            return;
        }
        handler.handler(blockPacket, baseEvent.getChannelContext());
    }
}
