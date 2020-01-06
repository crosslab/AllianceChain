package com.crosslab.blockchain.core.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crosslab.blockchain.common.exception.TrustSDKException;
import com.crosslab.blockchain.core.bean.BaseData;
import com.crosslab.blockchain.core.bean.ResultGenerator;
import com.crosslab.blockchain.core.service.PairKeyService;

import javax.annotation.Resource;

/**
 * @author crosslab wrote on 2018/3/7.
 */
@Api(tags = "区块链接口", description = "公私钥接口")
@RestController
@RequestMapping("/pairKey")
public class PairKeyController {
    @Resource
    private PairKeyService pairKeyService;

    /**
     * 生成公钥私钥
     */
    @ApiOperation(value = "区块链公私钥接口", notes = "生成区块链节点公私钥", httpMethod = "GET", response = BaseData.class)
    @GetMapping("/random")
    public BaseData generate() throws TrustSDKException {
         return ResultGenerator.genSuccessResult(pairKeyService.generate());
    }
}

