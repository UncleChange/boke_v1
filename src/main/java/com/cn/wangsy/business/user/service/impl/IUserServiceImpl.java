package com.cn.wangsy.business.user.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.wangsy.mapping.pojo.User;
import com.cn.wangsy.business.user.dao.UserDao;
import com.cn.wangsy.business.user.service.IUserService;

@Service("iUserService")
public class IUserServiceImpl implements IUserService{
	@Resource
	private UserDao userDao;
	
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return userDao.selectByPrimaryKey(userId);
	}
}
