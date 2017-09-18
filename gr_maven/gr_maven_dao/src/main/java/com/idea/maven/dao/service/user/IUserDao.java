package com.idea.maven.dao.service.user;

import java.util.List;

import com.idea.maven.dao.vo.Account;
import com.idea.maven.dao.vo.UserVo;

public interface IUserDao {

	public List<Account> findUserAll();
	
	public UserVo findUserByName(String userName);
	
}
