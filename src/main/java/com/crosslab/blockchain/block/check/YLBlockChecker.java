package com.crosslab.blockchain.block.check;

import com.crosslab.blockchain.block.YLBlock;

/**
 * 区块校验
 * @author crosslab wrote on 2018/3/13.
 */
public interface YLBlockChecker {
    /**
     * 比较目标区块和自己本地的区块num大小
     * @param block
     * 被比较的区块
     * @return
     * 本地与目标区块的差值
     */
    int checkNum(YLBlock block);

    /**
     * 校验区块内操作的权限是否合法
     * @param block
     * block
     * @return
     * 大于0合法
     */
    int checkPermission(YLBlock block);

    /**
     * 校验hash，包括prevHash、内部hash（merkle tree root hash）
     * @param block
     * block
     * @return
     * 大于0合法
     */
    int checkHash(YLBlock block);

    /**
     * 校验生成时间
     * @param block  block
     * @return block
     */
    int checkTime(YLBlock block);
    
    /**
     * 校验签名
     * @param block  block
     * @return block
     */
    int checkSign(YLBlock block);
    
    /**
     * 校验block，包括签名、hash、关联关系
     * @param block
     * @return
     */
    public String checkBlock(YLBlock block);
    
}
