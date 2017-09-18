package com.idea.maven.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idea.maven.dao.entity.Account;
import com.idea.maven.dao.service.user.IUserDao;
import com.idea.maven.service.IUserService;

@Service("userService")
public class IUserServiceImpl implements IUserService{
	
	@Autowired
	private IUserDao userDao;
	
	@Override
	public List<Account> findUserAll() {
		return userDao.findUserAll();
	}

}
