package com.crosslab.blockchain.core.manager;

import org.springframework.stereotype.Component;

import com.crosslab.blockchain.core.model.MessageEntity;
import com.crosslab.blockchain.core.repository.MessageRepository;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author crosslab wrote on 2018/3/28.
 */
@Component
public class MessageManager {
    @Resource
    private MessageRepository messageRepository;

    public List<MessageEntity> findAll() {
        return messageRepository.findAll();
    }

    public List<String> findAllContent() {
        return findAll().stream().map(MessageEntity::getContent).collect(Collectors.toList());
    }

    public MessageEntity findById(String id) {
        return messageRepository.findByMessageId(id);
    }
}
