package com.crosslab.blockchain.core.service;

import org.springframework.stereotype.Service;

import com.crosslab.blockchain.block.YLPairKey;
import com.crosslab.blockchain.common.TrustSDK;
import com.crosslab.blockchain.common.exception.TrustSDKException;

/**
 * @author crosslab wrote on 2018/3/7.
 */
@Service
public class PairKeyService {

    /**
     * 生成公私钥对
     * @return PairKey
     * @throws TrustSDKException TrustSDKException
     */
    public YLPairKey generate() throws TrustSDKException {
        return TrustSDK.generatePairKey(true);
    }
}
