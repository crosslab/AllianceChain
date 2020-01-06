package com.crosslab.blockchain.core.sqlparser;

import com.crosslab.blockchain.block.YLInstructionBase;

/**
 * @author crosslab wrote on 2018/3/21.
 */
public interface InstructionParser {
    boolean parse(YLInstructionBase yLInstructionBase);
}
