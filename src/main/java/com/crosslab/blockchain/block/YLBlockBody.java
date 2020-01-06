package com.crosslab.blockchain.block;

import java.util.List;

/**
 * 区块body，里面存放交易的数组
 * @author crosslab wrote on 2018/2/28.
 */
public class YLBlockBody {
    private List<YLInstruction> instructions;

    @Override
    public String toString() {
        return "BlockBody{" +
                "instructions=" + instructions +
                '}';
    }

    public List<YLInstruction> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<YLInstruction> instructions) {
        this.instructions = instructions;
    }
}
