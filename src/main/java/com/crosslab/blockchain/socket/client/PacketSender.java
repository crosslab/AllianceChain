package com.crosslab.blockchain.socket.client;

import org.springframework.stereotype.Component;
import org.tio.client.ClientGroupContext;
import org.tio.core.Aio;

import com.crosslab.blockchain.ApplicationContextProvider;
import com.crosslab.blockchain.core.event.ClientRequestEvent;
import com.crosslab.blockchain.socket.packet.BlockPacket;

import static com.crosslab.blockchain.socket.common.Const.GROUP_NAME;

import javax.annotation.Resource;

/**
 * 发送消息的工具类
 * @author crosslab wrote on 2018/3/12.
 */
@Component
public class PacketSender {
    @Resource
    private ClientGroupContext clientGroupContext;

    public void sendGroup(BlockPacket blockPacket) {
        //对外发出client请求事件
        ApplicationContextProvider.publishEvent(new ClientRequestEvent(blockPacket));
        //发送到一个group
        Aio.sendToGroup(clientGroupContext, GROUP_NAME, blockPacket);
    }

}
