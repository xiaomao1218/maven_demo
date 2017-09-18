package com.idea.maven.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.idea.maven.rpc.api.IUserRpcService;

public class TestController extends ConfigMainTest {
	
	@Autowired
	private IUserRpcService userRpcService;
	
	@Test
	public void test(){
		/*List<User> userList = userRpcService.findUserAll();
		for(User user : userList){
			System.out.println(user.getName());
		}*/
	}
	
}
