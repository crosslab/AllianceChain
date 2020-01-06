package com.crosslab.blockchain.socket.distruptor.base;

/**
 * @author crosslab wrote on 2018/4/20.
 */
public interface MessageConsumer {
    void receive(BaseEvent baseEvent) throws Exception;
}
