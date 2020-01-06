package com.crosslab.blockchain.core.manager;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.crosslab.blockchain.core.model.UserEntity;
import com.crosslab.blockchain.core.repository.UserRepository;

import javax.annotation.Resource;
import java.util.List;

@Component
public class UserManager {
    @Resource
    private UserRepository userRepository;
    public List<UserEntity> findAll(){
        return userRepository.findAll();
    }
    public UserEntity findOne(Example<UserEntity> example){
        return userRepository.findOne(example);
    }
    public UserEntity findOne(Long id){
        return userRepository.findOne(id);
    }
    public List<UserEntity> findAll(Example<UserEntity> example){
        return userRepository.findAll(example);
    }
}
