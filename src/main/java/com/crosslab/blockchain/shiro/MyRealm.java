package com.crosslab.blockchain.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

import com.crosslab.blockchain.core.model.Roles;
import com.crosslab.blockchain.core.model.UserEntity;
import com.crosslab.blockchain.core.repository.PermissionRepository;
import com.crosslab.blockchain.core.repository.RolesRepository;
import com.crosslab.blockchain.core.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class MyRealm extends AuthorizingRealm {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PermissionRepository permissionRepository;
    @Autowired
    private RolesRepository rolesRepository;
    
    private Logger logger = LoggerFactory.getLogger(AuthorizingRealm.class);
    /**
     *  授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用.
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        //获取登录时输入的用户名
        String username = (String) principalCollection.getPrimaryPrincipal();

        if (username != null) {
            //获取用户信息
            UserEntity userEntity = new UserEntity();
            userEntity.setIdnumber(username);
            Example<UserEntity> userEntityExample = Example.of(userEntity);
            UserEntity user = userRepository.findOne(userEntityExample);
            //获取用户角色
            Roles roles = new Roles();
            roles.setName(user.getName());
            Example<Roles> rolesExample = Example.of(roles);
            List<Roles> rolelList = rolesRepository.findAll(rolesExample);
            //获取权限列表
       //     Permission permission= new Permission();
       //     permission.setRid(String.valueOf(user.getId()));
         //   Example<Permission> permissionExample = Example.of(permission);
         //   List<Permission> permissions = permissionRepository.findAll(permissionExample);
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
    /*        for (int i=0;i<permissions.size();i++){
                info.addStringPermission((permissions.get(i).getUrl()));
            }*/

            if (rolelList != null && !rolelList.isEmpty()) {
                for (Roles role : rolelList) {
                	logger.info(role.toString());
                    info.addRole(role.getRole());//加入角色
                }
                return info;
            }

        }
        return null;
    }

    /**
     * 认证回调函数,登录时调用.
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token=(UsernamePasswordToken)authenticationToken;
        //通过表单接收的用户名
        String username=token.getUsername();
        logger.info("username:"+username);
        if(username!=null&&!"".equals(username)){
            UserEntity userEntity = new UserEntity();
            userEntity.setIdnumber(username);
            Example<UserEntity> userEntityExample = Example.of(userEntity);
            UserEntity user = userRepository.findOne(userEntityExample);
            if(user!=null){
                return new SimpleAuthenticationInfo(user.getIdnumber(),user.getPassword(),getName());
            }
        }
        logger.info("认证失败");
        return null;
    }

}