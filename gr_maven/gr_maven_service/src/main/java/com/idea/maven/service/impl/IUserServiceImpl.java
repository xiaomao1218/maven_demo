package com.idea.maven.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.idea.maven.dao.vo.UserVo;
import com.idea.maven.service.IUserService;

@Service("userService")
public class IUserServiceImpl implements IUserService{
	
//	@Autowired
//	private IUserDao userDao;
	
//	@Override
//	public List<Account> findUserAll() {
//		return userDao.findUserAll();
//	}

	@Override
	public UserVo findUserByName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<com.idea.maven.dao.vo.Account> findUserAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
