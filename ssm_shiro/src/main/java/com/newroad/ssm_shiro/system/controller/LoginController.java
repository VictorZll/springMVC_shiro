package com.newroad.ssm_shiro.system.controller;

import java.util.HashMap;
import java.util.Map;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	@ResponseBody
	public Map<String, String> login(String username,String password) {
		Subject currentUser = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		Map<String, String> map = new HashMap<>();
		try {
			currentUser.login(token);
			map.put("message", "登录成功");
		}catch (UnknownAccountException e) {
			map.put("message", "账号不存在");
		}catch (IncorrectCredentialsException e) {
			map.put("message", "密码错误");
		}catch (AuthenticationException e) {
			map.put("message", "未知异常");
		}
		map.put("username", username);
		map.put("password", password);
		return map;
	}

}
