package com.crosslab.blockchain.core.event;

import org.springframework.context.ApplicationEvent;

import com.crosslab.blockchain.block.YLBlock;

/**
 * 确定生成block的Event（添加到rocksDB，执行sqlite语句，发布给其他节点）
 * @author crosslab wrote on 2018/3/15.
 */
public class AddBlockEvent extends ApplicationEvent {
    public AddBlockEvent(YLBlock block) {
        super(block);
    }
}
