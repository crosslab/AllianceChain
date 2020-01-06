package com.crosslab.blockchain.core.sqlparser;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;

import org.springframework.stereotype.Service;

import com.crosslab.blockchain.block.YLOperation;
import com.crosslab.blockchain.core.model.CertificateApplyData;
import com.crosslab.blockchain.core.repository.CertificateRepository;

import javax.annotation.Resource;

@Service
public class CertificateSqlPaser extends AbstractSqlParser<CertificateApplyData> {

    @Resource
    CertificateRepository certificateRepository;

    @Override
    void parse(byte operation, String id, CertificateApplyData entity) {
        if (YLOperation.ADD == operation) {
            //  entity.setCreateTime(CommonUtil.getNow());
            certificateRepository.save(entity);
        } else if (YLOperation.DELETE == operation) {
             certificateRepository.delete(entity.getId());
        } else if (YLOperation.UPDATE == operation) {
            CertificateApplyData certificateApplyData = certificateRepository.findOne(entity.getId());
            BeanUtil.copyProperties(entity, certificateApplyData, CopyOptions.create().setIgnoreNullValue(true).setIgnoreProperties("createTime"));
            certificateRepository.save(certificateApplyData);
        }
    }

    @Override
    Class getEntityClass() {
        return CertificateApplyData.class;
    }
}
