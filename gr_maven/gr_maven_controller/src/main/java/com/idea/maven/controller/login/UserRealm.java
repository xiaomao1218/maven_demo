package com.idea.maven.controller.login;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.alibaba.dubbo.config.annotation.Reference;
import com.idea.maven.rpc.api.IUserRpcService;

public class UserRealm extends AuthorizingRealm {

	@Reference
	private IUserRpcService userRpcService;
	
	/**
	 * 权限验证
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String username = (String) principals.getPrimaryPrincipal(); //获取用户名
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        System.out.println("用户名："+username);
        //authorizationInfo.setRoles(userService.getRoles(username));
        //authorizationInfo.setStringPermissions(userService.getPermissions(username));
        return authorizationInfo;
	}

	/**
	 * 登录验证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		String username = (String) token.getPrincipal(); // 获取用户名
		System.out.println("用户名："+username);
//		UserVo userVo = userRpcService.findUserByName(username);
//      if(userVo != null) {
//          AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(userVo.getName(), userVo.getPassword(), "myRealm");
//          return authcInfo;
//      }  
        return null;
	}

}
