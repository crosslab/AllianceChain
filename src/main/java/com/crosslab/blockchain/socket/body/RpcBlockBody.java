package com.crosslab.blockchain.socket.body;

import com.crosslab.blockchain.block.YLBlock;

/**
 * body里是一个block信息
 * @author crosslab wrote on 2018/3/12.
 */
public class RpcBlockBody extends BaseBody {
    /**
     * blockJson
     */
    private YLBlock block;

    public RpcBlockBody() {
        super();
    }

    public RpcBlockBody(YLBlock block) {
        super();
        this.block = block;
    }

    public YLBlock getBlock() {
        return block;
    }

    public void setBlock(YLBlock block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "BlockBody{" +
                "block=" + block +
                '}';
    }
}
