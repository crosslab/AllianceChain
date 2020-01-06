package com.crosslab.blockchain.socket.pbft.msg;

import com.crosslab.blockchain.block.YLBlock;

/**
 * @author crosslab wrote on 2018/4/25.
 */
public class VotePreMsg extends VoteMsg {
    private YLBlock block;

    public YLBlock getBlock() {
        return block;
    }

    public void setBlock(YLBlock block) {
        this.block = block;
    }
}
