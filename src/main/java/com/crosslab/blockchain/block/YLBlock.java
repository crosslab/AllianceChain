package com.crosslab.blockchain.block;

import cn.hutool.crypto.digest.DigestUtil;

/**
 * 区块
 * @author crosslab wrote on 2018/2/27.
 */
public class YLBlock {
    /**
     * 区块头
     */
    private YLBlockHeader blockHeader;
    /**
     * 区块body
     */
    private YLBlockBody blockBody;
    /**
     * 该区块的hash
     */
    private String hash;

    /**
     * 根据该区块所有属性计算sha256
     * @return
     * sha256hex
     */
    private String calculateHash() {
        return DigestUtil.sha256Hex(
                        blockHeader.toString() + blockBody.toString()
        );
    }

    public YLBlockHeader getBlockHeader() {
        return blockHeader;
    }

    public void setBlockHeader(YLBlockHeader blockHeader) {
        this.blockHeader = blockHeader;
    }

    public YLBlockBody getBlockBody() {
        return blockBody;
    }

    public void setBlockBody(YLBlockBody yLBlockBody) {
        this.blockBody = yLBlockBody;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    @Override
    public String toString() {
        return "Block{" +
                "blockHeader=" + blockHeader +
                ", blockBody=" + blockBody +
                ", hash='" + hash + '\'' +
                '}';
    }
}
