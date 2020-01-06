# AllianceChain项目简介
一个Java版本的联盟链或私有链的区块链项目，主要包括存储、加密、网络通信、PBFT共识算法、公钥私钥、区块内容解析落地入库等。

# alliance_chain_manager项目简介
联盟链或私有链的管理模块，主要功能是提供联盟链内各节点ip和各节点的权限信息。

### 简单使用说明

1、导入工程里的sql数据库文件，修改AllianceChain中application.yml里的name、appid，使其与数据库里的某个值对应，作为一个节点；

2、启动alliance_chain_manager项目。
