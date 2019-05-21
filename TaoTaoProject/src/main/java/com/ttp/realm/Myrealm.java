package com.ttp.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;



/**  
* Title: MyRealm.java 
* Description: 
* Copyright: Copyright (c) 2018    
* @author zhh  
* @date 2019年4月23日  
* @version 1.0  
*/
public class Myrealm extends AuthorizingRealm{
	/* 授权
	 * @see org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		
		return null;
	}

	/* 认证
	 * @see org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		return null;
		/*UsernamePasswordToken token = (UsernamePasswordToken) arg0;
		String username = token.getUsername();
		String password =new String(token.getPassword());
		SimpleHash simpleHash=new SimpleHash("Md5", password, username, 1024);
		String md5pwd = simpleHash.toString();
		SysUser user = dao.findByLogin(username, md5pwd);
		AuthenticationInfo info = null;
		if(user!=null){
			info = new SimpleAuthenticationInfo(username,password,getName());
		}else{
			throw new AuthenticationException();
		}
		return info;*/
	}
	/*public static void main(String[] args) {
		SimpleHash simpleHash=new SimpleHash("Md5", "123456", "123@qq.com", 1024);
		String md5pwd = simpleHash.toString();
		System.out.println(md5pwd);
	}*/

}
