package com.crosslab.blockchain.core.sqlparser;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;

import org.springframework.stereotype.Service;

import com.crosslab.blockchain.block.YLOperation;
import com.crosslab.blockchain.core.model.CertificateApplyData;
import com.crosslab.blockchain.core.model.FileCheckData;
import com.crosslab.blockchain.core.repository.FileCheckRepository;

import javax.annotation.Resource;

@Service
public class FileCheckSqlParser extends AbstractSqlParser<FileCheckData> {

    @Resource
    FileCheckRepository fileCheckRepository;

    @Override
    void parse(byte operation, String id, FileCheckData entity) {
        if (YLOperation.ADD == operation) {
            //  entity.setCreateTime(CommonUtil.getNow());
            fileCheckRepository.save(entity);
        } else if (YLOperation.DELETE == operation) {
            fileCheckRepository.delete(entity.getId());
        } else if (YLOperation.UPDATE == operation) {
           FileCheckData fileCheckData = fileCheckRepository.findOne(entity.getId());
            BeanUtil.copyProperties(entity, fileCheckData, CopyOptions.create().setIgnoreNullValue(true).setIgnoreProperties("createTime"));
            fileCheckRepository.save(fileCheckData);
        }
    }

    @Override
    Class getEntityClass() {
        return FileCheckData.class;
    }
}
