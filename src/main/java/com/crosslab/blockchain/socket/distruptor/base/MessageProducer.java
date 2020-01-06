package com.crosslab.blockchain.socket.distruptor.base;

/**
 * @author crosslab wrote on 2018/4/20.
 */
public interface MessageProducer {
    void publish(BaseEvent baseEvent);
}
