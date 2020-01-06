package com.crosslab.blockchain.core.requestbody;

import com.crosslab.blockchain.block.YLBlockBody;

/**
 * 生成Block时传参
 * @author crosslab wrote on 2018/3/8.
 */
public class BlockRequestBody {
    private String publicKey;
    private YLBlockBody yLBlockBody;

    @Override
    public String toString() {
        return "BlockRequestBody{" +
                "publicKey='" + publicKey + '\'' +
                ", blockBody=" + yLBlockBody +
                '}';
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public YLBlockBody getBlockBody() {
        return yLBlockBody;
    }

    public void setBlockBody(YLBlockBody yLBlockBody) {
        this.yLBlockBody = yLBlockBody;
    }
}
