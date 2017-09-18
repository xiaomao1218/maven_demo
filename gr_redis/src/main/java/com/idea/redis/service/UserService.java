package com.idea.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idea.redis.dao.IUserDao;
import com.idea.redis.entity.User;

@Service
public class UserService {
	
	@Autowired
	private IUserDao userDao;
	
	public boolean addUser(User user){
		return userDao.add(user);
	}

	public User getUser(String keyId){
		return userDao.get(keyId);
	}
}
