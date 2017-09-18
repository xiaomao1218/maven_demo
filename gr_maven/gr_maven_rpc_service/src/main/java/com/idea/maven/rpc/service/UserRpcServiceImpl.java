package com.idea.maven.rpc.service;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.idea.maven.rpc.api.IUserRpcService;
import com.idea.maven.service.IUserService;

@Service
public class UserRpcServiceImpl implements IUserRpcService {

	@Resource(name = "userService")
	private IUserService userService;
	
//	@Override
//	public List<UserVo> findUserAll() {
//		List<UserVo> userList = new ArrayList<UserVo>();
//		List<Account> accountList = userService.findUserAll();
//		for(Account account : accountList){
//			UserVo user = new UserVo();
//			user.setId(account.getId());
//			user.setName(account.getAccountName());
//			user.setPhone(account.getOriginSystem());
//			userList.add(user);
//		}
//		return userList;
//	}
//
//	@Override
//	public com.idea.maven.dao.entity.UserVo findUserByName(String userName) {
//		UserVo user = userService.findUserByName(userName);
//		if(user != null){
//			UserVo userVo = new UserVo();
//			Utils.copyObject(user, userVo);
//			return userVo;
//		}
//		return null;
//	}

}
