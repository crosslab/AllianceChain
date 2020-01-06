package com.crosslab.blockchain.socket.distruptor.base;

import com.lmax.disruptor.EventFactory;

/**
 * @author crosslab wrote on 2018/4/20.
 */
public class BaseEventFactory implements EventFactory<BaseEvent> {
    @Override
    public BaseEvent newInstance() {
        return new BaseEvent();
    }

}
