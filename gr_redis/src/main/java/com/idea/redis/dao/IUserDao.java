package com.idea.redis.dao;

import java.util.List;

import com.idea.redis.entity.User;


public interface IUserDao {

	boolean add(User user); 
	
	boolean add(List<User> list);
	
	Long delete(String key); 
	
	void delete(List<String> keys);
	
	boolean update(User user);
	
	User get(String keyId);  
}

