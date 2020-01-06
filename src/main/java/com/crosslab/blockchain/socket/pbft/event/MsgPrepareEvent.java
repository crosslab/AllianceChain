package com.crosslab.blockchain.socket.pbft.event;

import org.springframework.context.ApplicationEvent;

import com.crosslab.blockchain.socket.pbft.msg.VoteMsg;

/**
 * 消息已被验证，进入到Prepare集合中
 * @author crosslab wrote on 2018/4/25.
 */
public class MsgPrepareEvent extends ApplicationEvent {
    public MsgPrepareEvent(VoteMsg source) {
        super(source);
    }
}
