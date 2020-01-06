package com.crosslab.blockchain.socket.distruptor.base;

import org.tio.core.ChannelContext;

import com.crosslab.blockchain.socket.packet.BlockPacket;

import java.io.Serializable;

/**
 * 生产者、消费者之间传递消息用的event
 *
 * @author crosslab wrote on 2018/4/20.
 */
public class BaseEvent implements Serializable {
	private static final long serialVersionUID = 237776744L;
	
	private BlockPacket blockPacket;
    private ChannelContext channelContext;

    public BaseEvent(BlockPacket blockPacket, ChannelContext channelContext) {
        this.blockPacket = blockPacket;
        this.channelContext = channelContext;
    }

    public BaseEvent(BlockPacket blockPacket) {
        this.blockPacket = blockPacket;
    }

    public BaseEvent() {
    }

    public ChannelContext getChannelContext() {
        return channelContext;
    }

    public void setChannelContext(ChannelContext channelContext) {
        this.channelContext = channelContext;
    }

    public BlockPacket getBlockPacket() {
        return blockPacket;
    }

    public void setBlockPacket(BlockPacket blockPacket) {
        this.blockPacket = blockPacket;
    }
}
