package com.crosslab.blockchain.core.manager;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.crosslab.blockchain.core.model.SyncEntity;
import com.crosslab.blockchain.core.repository.SyncRepository;

import javax.annotation.Resource;

/**
 * @author crosslab wrote on 2018/3/21.
 */
@Service
public class SyncManager {
    @Resource
    private SyncRepository syncRepository;

    public SyncEntity findLastOne() {
        return syncRepository.findTopByOrderByIdDesc();
    }

    public SyncEntity save(SyncEntity syncEntity) {
        return syncRepository.save(syncEntity);
    }

    public Object findAll(Pageable pageable) {
        return syncRepository.findAll(pageable);
    }

    public void deleteAll() {
        syncRepository.deleteAll();
    }
}
