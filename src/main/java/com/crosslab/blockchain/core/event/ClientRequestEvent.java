package com.crosslab.blockchain.core.event;

import org.springframework.context.ApplicationEvent;

import com.crosslab.blockchain.socket.packet.BlockPacket;

/**
 * 客户端对外发请求时会触发该Event
 * @author crosslab wrote on 2018/3/17.
 */
public class ClientRequestEvent extends ApplicationEvent {
    public ClientRequestEvent(BlockPacket blockPacket) {
        super(blockPacket);
    }
}
