package com.crosslab.blockchain.core.sqlparser;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crosslab.blockchain.block.YLInstruction;
import com.crosslab.blockchain.block.YLInstructionBase;
import com.crosslab.blockchain.common.FastJsonUtil;
import com.crosslab.blockchain.core.model.base.BaseEntity;
import com.crosslab.blockchain.core.model.convert.ConvertTableName;

/**
 * 将区块内指令解析并入库
 * @author crosslab wrote on 2018/3/21.
 */
@Service
public class InstructionParserImpl<T extends BaseEntity> implements InstructionParser {
    @Resource
    private ConvertTableName<T> convertTableName;
    @Resource
    private AbstractSqlParser<T>[] sqlParsers;

    @Override
    public boolean parse(YLInstructionBase yLInstructionBase) {
        byte operation = yLInstructionBase.getOperation();
        String table = yLInstructionBase.getTable();
        String json = yLInstructionBase.getOldJson();
        //表对应的类名，如MessageEntity.class
        Class<T> clazz = convertTableName.convertOf(table);
        T object = FastJsonUtil.toBean(json, clazz);
        for (AbstractSqlParser<T> sqlParser : sqlParsers) {
            if (clazz.equals(sqlParser.getEntityClass())) {
            	if(yLInstructionBase instanceof YLInstruction){
            		object.setPublicKey(((YLInstruction)yLInstructionBase).getPublicKey());
            	}
                sqlParser.parse(operation, yLInstructionBase.getInstructionId(), object);
                break;
            }
        }

        return true;
    }
}
