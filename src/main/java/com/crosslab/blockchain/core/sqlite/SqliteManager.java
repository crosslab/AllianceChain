package com.crosslab.blockchain.core.sqlite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.crosslab.blockchain.ApplicationContextProvider;
import com.crosslab.blockchain.block.YLBlock;
import com.crosslab.blockchain.block.YLInstruction;
import com.crosslab.blockchain.block.YLInstructionBase;
import com.crosslab.blockchain.block.YLInstructionReverse;
import com.crosslab.blockchain.core.event.DbSyncEvent;
import com.crosslab.blockchain.core.manager.DbBlockManager;
import com.crosslab.blockchain.core.manager.SyncManager;
import com.crosslab.blockchain.core.model.SyncEntity;
import com.crosslab.blockchain.core.service.InstructionService;
import com.crosslab.blockchain.core.sqlparser.InstructionParser;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 对sqlite数据库的操作（监听新增区块请求，执行对应的sql命令）
 *
 * @author crosslab wrote on 2018/3/15.
 */
@Component
public class SqliteManager {
    @Resource
    private InstructionParser instructionParser;
    @Resource
    private SyncManager syncManager;
    @Resource
    private DbBlockManager dbBlockManager;
    @Resource
    private InstructionService instructionService;

    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * sqlite同步，监听该事件后，去check当前已经同步到哪个区块了，然后继续执行之后的区块
     */
    @EventListener(DbSyncEvent.class)
    public void dbSync() {
        logger.info("开始执行导入区块到Sqlite操作");
        //查看同步到哪个区块了
        SyncEntity syncEntity = syncManager.findLastOne();

        YLBlock block;
        if (syncEntity == null) {
            //从第一个开始
            block = dbBlockManager.getFirstBlock();
            logger.info("正在导入第一个区块，hash为：" + block.getHash());
        } else {
            YLBlock lastBlock = dbBlockManager.getLastBlock();
            //已经同步到最后一块了
            if (lastBlock.getHash().equals(syncEntity.getHash())) {
                logger.info("导入完毕");
                return;
            }
            logger.info("正在导入区块，hash为：" + lastBlock.getHash());
            String hash = syncEntity.getHash();
            block = dbBlockManager.getNextBlock(dbBlockManager.getBlockByHash(hash));
        }
        execute(block);
        ApplicationContextProvider.publishEvent(new DbSyncEvent(""));
    }

    /**
     * 根据一个block执行sql
     * 整个block一个事务
     * 
     * @param block
     *         block
     */
    @Transactional(rollbackFor = Exception.class)
    public void execute(YLBlock block) {
        List<YLInstruction> yLInstructions = block.getBlockBody().getInstructions();
        //InstructionParserImpl类里面执行的是InstructionBase，需要转成InstructionBase
        for (YLInstruction yLInstruction : yLInstructions) {
            yLInstruction.setOldJson(yLInstruction.getJson());
        }
        doSqlParse(yLInstructions);

        //保存已同步的进度
        SyncEntity syncEntity = new SyncEntity();
        syncEntity.setHash(block.getHash());
        syncManager.save(syncEntity);
    }

    /**
     * 执行回滚一个block
     *
     * @param block
     *         block
     */
    public void rollBack(YLBlock block) {
        List<YLInstruction> yLInstructions = block.getBlockBody().getInstructions();
        int size = yLInstructions.size();
        //需要对语句集合进行反转，然后执行和execute一样的操作
        List<YLInstructionReverse> yLInstructionReverses = new ArrayList<>(size);
        for (int i = size - 1; i >= 0; i--) {
            yLInstructionReverses.add(instructionService.buildReverse(yLInstructions.get(i)));
        }
        doSqlParse(yLInstructionReverses);
    }

    private <T extends YLInstructionBase> void doSqlParse(List<T> instructions) {
        for (YLInstructionBase instruction : instructions) {
            instructionParser.parse(instruction);
            logger.info(instruction.getOldJson()+"============");
        }
    }
    
    /**
     * 测试block的代码是否能正确执行
     * 
     * @param block block
     */
    @Transactional(rollbackFor = Exception.class)
    public void tryExecute(YLBlock block) {
    	execute(block);
    }
}
