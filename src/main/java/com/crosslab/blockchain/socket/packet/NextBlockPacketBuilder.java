package com.crosslab.blockchain.socket.packet;

import com.crosslab.blockchain.ApplicationContextProvider;
import com.crosslab.blockchain.core.event.ClientRequestEvent;
import com.crosslab.blockchain.core.manager.DbBlockManager;
import com.crosslab.blockchain.socket.body.RpcSimpleBlockBody;

/**
 * 构建向别的节点请求next block的builder.带着自己最后一个block的hash
 * @author crosslab wrote on 2018/3/20.
 */
public class NextBlockPacketBuilder {
    public static BlockPacket build() {
        return build(null);
    }

    public static BlockPacket build(String responseId) {
        String hash = ApplicationContextProvider.getBean(DbBlockManager.class).getLastBlockHash();

        RpcSimpleBlockBody rpcBlockBody = new RpcSimpleBlockBody(hash);
        rpcBlockBody.setResponseMsgId(responseId);
        BlockPacket blockPacket = new PacketBuilder<>().setType(PacketType.NEXT_BLOCK_INFO_REQUEST).setBody
                (rpcBlockBody).build();
        //发布client请求事件
        ApplicationContextProvider.publishEvent(new ClientRequestEvent(blockPacket));
        return blockPacket;
    }

}
