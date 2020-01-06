package com.crosslab.blockchain.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crosslab.blockchain.core.model.SyncEntity;

/**
 * @author crosslab wrote on 2017/10/25.
 */
public interface SyncRepository extends JpaRepository<SyncEntity, Long> {
    SyncEntity findTopByOrderByIdDesc();
}
