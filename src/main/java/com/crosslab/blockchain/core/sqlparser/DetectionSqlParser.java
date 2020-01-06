package com.crosslab.blockchain.core.sqlparser;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;

import org.springframework.stereotype.Service;

import com.crosslab.blockchain.block.YLOperation;
import com.crosslab.blockchain.core.model.DetectionData;
import com.crosslab.blockchain.core.repository.DetectionRepository;

import javax.annotation.Resource;

@Service
public class DetectionSqlParser extends AbstractSqlParser<DetectionData>{

    @Resource
    DetectionRepository detectionRepository;


    @Override
    void parse(byte operation, String id, DetectionData entity) {
        if (YLOperation.ADD == operation) {
            //  entity.setCreateTime(CommonUtil.getNow());
            detectionRepository.save(entity);
        } else if (YLOperation.DELETE == operation) {
            detectionRepository.delete(entity.getId());
        } else if (YLOperation.UPDATE == operation) {
            DetectionData detectionData = detectionRepository.findOne(entity.getId());
            BeanUtil.copyProperties(entity, detectionData, CopyOptions.create().setIgnoreNullValue(true).setIgnoreProperties("createTime"));
            detectionRepository.save(detectionData);
        }
    }

    @Override
    Class getEntityClass() {
        return DetectionData.class;
    }
}
