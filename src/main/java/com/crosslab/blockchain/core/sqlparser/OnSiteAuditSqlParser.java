package com.crosslab.blockchain.core.sqlparser;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;

import org.springframework.stereotype.Service;

import com.crosslab.blockchain.block.YLOperation;
import com.crosslab.blockchain.core.model.OnSiteAuditData;
import com.crosslab.blockchain.core.repository.OnSiteAuditRepository;

import javax.annotation.Resource;

@Service
public class OnSiteAuditSqlParser extends  AbstractSqlParser<OnSiteAuditData> {

    @Resource
    OnSiteAuditRepository onSiteAuditRepository;

    @Override
    void parse(byte operation, String id, OnSiteAuditData entity) {
        if (YLOperation.ADD == operation) {
            //  entity.setCreateTime(CommonUtil.getNow());
            onSiteAuditRepository.save(entity);
        } else if (YLOperation.DELETE == operation) {
            onSiteAuditRepository.delete(entity.getId());
        } else if (YLOperation.UPDATE == operation) {
            OnSiteAuditData onSiteAuditData = onSiteAuditRepository.findOne(entity.getId());
            BeanUtil.copyProperties(entity, onSiteAuditData, CopyOptions.create().setIgnoreNullValue(true).setIgnoreProperties("createTime"));
            onSiteAuditRepository.save(onSiteAuditData);
        }
    }

    @Override
    Class getEntityClass() {
        return OnSiteAuditData.class;
    }
}
