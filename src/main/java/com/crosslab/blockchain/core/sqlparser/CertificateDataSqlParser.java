package com.crosslab.blockchain.core.sqlparser;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;

import org.springframework.stereotype.Service;

import com.crosslab.blockchain.block.YLOperation;
import com.crosslab.blockchain.core.model.CertificationData;
import com.crosslab.blockchain.core.repository.CertificateDataRepository;

import javax.annotation.Resource;

@Service
public class CertificateDataSqlParser extends AbstractSqlParser<CertificationData>{

    @Resource
    CertificateDataRepository certificateDataRepository;


    @Override
    void parse(byte operation, String id, CertificationData entity) {
        if (YLOperation.ADD == operation) {
            //  entity.setCreateTime(CommonUtil.getNow());
            certificateDataRepository.save(entity);
        } else if (YLOperation.DELETE == operation) {
            certificateDataRepository.delete(entity.getId());
        } else if (YLOperation.UPDATE == operation) {
           CertificationData certificationData = certificateDataRepository.findOne(entity.getId());
            BeanUtil.copyProperties(entity, certificationData, CopyOptions.create().setIgnoreNullValue(true).setIgnoreProperties("createTime"));
            certificateDataRepository.save(certificationData);
        }
    }

    @Override
    Class getEntityClass() {
        return CertificationData.class;
    }
}
