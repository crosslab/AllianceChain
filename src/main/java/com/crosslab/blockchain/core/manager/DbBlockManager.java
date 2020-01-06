package com.crosslab.blockchain.core.manager;

import cn.hutool.core.util.StrUtil;

import org.springframework.stereotype.Service;

import com.crosslab.blockchain.block.YLBlock;
import com.crosslab.blockchain.block.db.DbStore;
import com.crosslab.blockchain.common.Constants;
import com.crosslab.blockchain.common.FastJsonUtil;

import javax.annotation.Resource;

/**
 * @author crosslab wrote on 2018/3/13.
 */
@Service
public class DbBlockManager {
    @Resource
    private DbStore dbStore;

    /**
     * 查找第一个区块
     *
     * @return 第一个Block
     */
    public YLBlock getFirstBlock() {
        String firstBlockHash = dbStore.get(Constants.KEY_FIRST_BLOCK);
        if (StrUtil.isEmpty(firstBlockHash)) {
            return null;
        }
        return getBlockByHash(firstBlockHash);
    }

    /**
     * 获取最后一个区块信息
     *
     * @return 最后一个区块
     */
    public YLBlock getLastBlock() {
        String lastBlockHash = dbStore.get(Constants.KEY_LAST_BLOCK);
        if (StrUtil.isEmpty(lastBlockHash)) {
            return null;
        }
        return getBlockByHash(lastBlockHash);
    }

    /**
     * 获取最后一个区块的hash
     *
     * @return hash
     */
    public String getLastBlockHash() {
        YLBlock block = getLastBlock();
        if (block != null) {
            return block.getHash();
        }
        return null;
    }

    /**
     * 获取最后一个block的number
     * @return number
     */
    public int getLastBlockNumber() {
        YLBlock block = getLastBlock();
        if (block != null) {
            return block.getBlockHeader().getNumber();
        }
        return 0;
    }

    /**
     * 获取某一个block的下一个Block
     *
     * @param block
     *         block
     * @return block
     */
    public YLBlock getNextBlock(YLBlock block) {
        if (block == null) {
            return getFirstBlock();
        }
        String nextHash = dbStore.get(Constants.KEY_BLOCK_NEXT_PREFIX + block.getHash());
        if (nextHash == null) {
            return null;
        }
        return getBlockByHash(nextHash);
    }

    public YLBlock getNextBlockByHash(String hash) {
        if (hash == null) {
            return getFirstBlock();
        }
        String nextHash = dbStore.get(Constants.KEY_BLOCK_NEXT_PREFIX + hash);
        if (nextHash == null) {
            return null;
        }
        return getBlockByHash(nextHash);
    }

    public YLBlock getBlockByHash(String hash) {
        String blockJson = dbStore.get(hash);
        return FastJsonUtil.toBean(blockJson, YLBlock.class);
    }

}
