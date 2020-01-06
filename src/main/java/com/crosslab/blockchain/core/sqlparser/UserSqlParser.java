package com.crosslab.blockchain.core.sqlparser;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;

import org.springframework.stereotype.Service;

import com.crosslab.blockchain.block.YLOperation;
import com.crosslab.blockchain.common.CommonUtil;
import com.crosslab.blockchain.core.model.UserEntity;
import com.crosslab.blockchain.core.repository.UserRepository;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class UserSqlParser extends AbstractSqlParser<UserEntity> {

    @Resource
    UserRepository userRepository;

    @Override
    public  void parse(byte operation, String id, UserEntity entity) {
      //  id = String.valueOf(entity.getId()) ;
        Date day = new Date();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 //       System.out.println(entity.toString()+"------------------------------------------------------------");
        if (YLOperation.ADD == operation) {
            entity.setCreateTime(CommonUtil.getNow());
            userRepository.save(entity);
        } else if (YLOperation.DELETE == operation) {
           // userRepository.deleteByMessageId(messageId);
        } else if (YLOperation.UPDATE == operation) {
            UserEntity userEntity = userRepository.findOne(entity.getId());
            BeanUtil.copyProperties(entity, userEntity, CopyOptions.create().setIgnoreNullValue(true).setIgnoreProperties("createTime"));
            userRepository.save(userEntity);
        }
    }

    @Override
    Class getEntityClass() {
        return UserEntity.class;
    }


}
