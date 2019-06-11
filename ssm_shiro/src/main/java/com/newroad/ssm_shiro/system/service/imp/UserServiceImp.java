package com.newroad.ssm_shiro.system.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.newroad.ssm_shiro.system.dao.IUserDao;
import com.newroad.ssm_shiro.system.entity.User;
import com.newroad.ssm_shiro.system.service.UserServiceIf;
@Service
@Transactional
public class UserServiceImp implements UserServiceIf {
	@Resource
	IUserDao dao;

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
