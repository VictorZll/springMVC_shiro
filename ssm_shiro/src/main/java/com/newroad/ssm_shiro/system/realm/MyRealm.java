package com.newroad.ssm_shiro.system.realm;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import com.newroad.ssm_shiro.system.dao.IUserDao;
import com.newroad.ssm_shiro.system.entity.User;

public class MyRealm extends AuthorizingRealm {
	@Resource
	IUserDao userDao ;
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken upt = (UsernamePasswordToken) token;
		String username = upt.getUsername();
		if(username == null) {
			throw new AuthenticationException("用户名不能为null");
		}
		//通过用户名查找用户信息
		User user = userDao.selectByUsername(username);
		if(user==null) {
			return null ;
		}
		String password = user.getPassword() ;
		String salt = user.getSalt();
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(username, password, ByteSource.Util.bytes(salt), getName());
		return info;
	}

}
