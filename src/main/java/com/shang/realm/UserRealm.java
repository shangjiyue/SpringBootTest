package com.shang.realm;

import com.shang.team.entity.User;
import com.shang.team.service.IUserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: sjy
 * @create: 2019-02-28 21:40
 * @Description: shiro自定义realm
 * @Version: 1.0
 **/

public class UserRealm extends AuthorizingRealm{
    @Autowired
    private IUserService userService;

    //控制角色权限
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    //控制登陆
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        AuthenticationInfo info;
        String username = authenticationToken.getPrincipal().toString();
        User user = userService.selectUserByUsername(username);
        if (user != null) {
            info = new SimpleAuthenticationInfo(username, "", getName());
            return info;
        }
        return null;
    }
}
