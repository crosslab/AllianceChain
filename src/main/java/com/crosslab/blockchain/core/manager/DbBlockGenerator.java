package com.crosslab.blockchain.core.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.tio.utils.json.Json;

import com.crosslab.blockchain.ApplicationContextProvider;
import com.crosslab.blockchain.block.YLBlock;
import com.crosslab.blockchain.block.check.YLCheckerManager;
import com.crosslab.blockchain.block.db.DbStore;
import com.crosslab.blockchain.common.Constants;
import com.crosslab.blockchain.core.event.AddBlockEvent;
import com.crosslab.blockchain.core.event.DbSyncEvent;

import javax.annotation.Resource;

/**
 * block的本地存储
 * @author crosslab wrote on 2018/4/25.
 */
@Service
public class DbBlockGenerator {
    @Resource
    private DbStore dbStore;
    @Resource
    private YLCheckerManager yLCheckerManager;
    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 数据库里添加一个新的区块
     *
     * @param  addBlockEvent
     *         addBlockEvent
     */
    @Order(1)
    @EventListener(AddBlockEvent.class)
    public synchronized void addBlock(AddBlockEvent addBlockEvent) {
        logger.info("开始生成本地block");
        YLBlock block = (YLBlock) addBlockEvent.getSource();
        String hash = block.getHash();
        //如果已经存在了，说明已经更新过该Block了
        if (dbStore.get(hash) != null) {
            return;
        }
        //校验区块
        if (yLCheckerManager.check(block).getCode() != 0) {
            return;
        }

        //如果没有上一区块，说明该块就是创世块
        if (block.getBlockHeader().getHashPreviousBlock() == null) {
            dbStore.put(Constants.KEY_FIRST_BLOCK, hash);
        } else {
            //保存上一区块对该区块的key value映射
            dbStore.put(Constants.KEY_BLOCK_NEXT_PREFIX + block.getBlockHeader().getHashPreviousBlock(), hash);
        }
        //存入rocksDB
        dbStore.put(hash, Json.toJson(block));
        //设置最后一个block的key value
        dbStore.put(Constants.KEY_LAST_BLOCK, hash);

        logger.info("本地已生成新的Block");

        //同步到sqlite
        sqliteSync();
    }

    /**
     * sqlite根据block信息，执行sql
     */
    @Async
    public void sqliteSync() {
        //开始同步到sqlite
        ApplicationContextProvider.publishEvent(new DbSyncEvent(""));
    }
}
