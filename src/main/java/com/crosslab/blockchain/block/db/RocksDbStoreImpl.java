package com.crosslab.blockchain.block.db;

import org.rocksdb.RocksDB;
import org.rocksdb.RocksDBException;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import com.crosslab.blockchain.socket.common.Const;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;

/**
 * rocksDB对于存储接口的实现
 * @author crosslab wrote on 2018/3/13.
 */
@Component
@ConditionalOnProperty("db.rocksDB")
public class RocksDbStoreImpl implements DbStore {
    @Resource
    private RocksDB rocksDB;

    @Override
    public void put(String key, String value) {
        try {
            rocksDB.put(key.getBytes(Const.CHARSET), value.getBytes(Const.CHARSET));
        } catch (RocksDBException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


    @Override
    public String get(String key) {
        try {
            byte[] bytes = rocksDB.get(key.getBytes(Const.CHARSET));
            if (bytes != null) {
                return new String(bytes, Const.CHARSET);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void remove(String key) {
        try {
            rocksDB.delete(rocksDB.get(key.getBytes(Const.CHARSET)));
        } catch (RocksDBException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
