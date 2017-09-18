package com.idea.maven.service;

import java.util.List;

import com.idea.maven.dao.vo.Account;
import com.idea.maven.dao.vo.UserVo;

public interface IUserService {
	
	public List<Account> findUserAll();	
	
	public UserVo findUserByName(String userName);
	
}
