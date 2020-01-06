package com.crosslab.blockchain.common.utils;

import cn.hutool.core.collection.CollectionUtil;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.crosslab.blockchain.block.YLInstruction;
import com.crosslab.blockchain.block.YLBlockBody;
import com.crosslab.blockchain.core.requestbody.BlockRequestBody;
import com.crosslab.blockchain.core.requestbody.InstructionBody;
import com.crosslab.blockchain.core.service.BlockService;
import com.crosslab.blockchain.core.service.InstructionService;

import javax.annotation.Resource;


@Service
public class UploadBlockUtil {

    @Value("${publicKey:A8WLqHTjcT/FQ2IWhIePNShUEcdCzu5dG+XrQU8OMu54}")
    private  String publicKey;
    @Value("${privateKey:yScdp6fNgUU+cRUTygvJG4EBhDKmOMRrK4XJ9mKVQJ8=}")
    private  String privateKey;

    @Resource
    private  InstructionService instructionService;

    @Resource
    private  BlockService blockService;

    public void uploadBlock(String json,byte operation,String tableName){

        InstructionBody instructionBody = new InstructionBody();
        instructionBody.setOperation(operation);
        instructionBody.setTable(tableName);
        instructionBody.setJson(json);
        instructionBody.setPublicKey(publicKey);
        instructionBody.setPrivateKey(privateKey);
        YLInstruction yLInstruction = null;
        try {
            yLInstruction = instructionService.build(instructionBody);
        } catch (Exception e) {
            e.printStackTrace();
        }
        BlockRequestBody blockRequestBody = new BlockRequestBody();
        blockRequestBody.setPublicKey(instructionBody.getPublicKey());
        YLBlockBody yLBlockBody = new YLBlockBody();
        yLBlockBody.setInstructions(CollectionUtil.newArrayList(yLInstruction));

        blockRequestBody.setBlockBody(yLBlockBody);
        blockService.addBlock(blockRequestBody);
    }
}
