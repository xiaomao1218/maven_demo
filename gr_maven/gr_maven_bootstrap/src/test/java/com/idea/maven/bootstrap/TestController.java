package com.idea.maven.bootstrap;


import org.junit.Test;

import com.alibaba.dubbo.config.annotation.Reference;
import com.idea.maven.rpc.api.IUserRpcService;

public class TestController extends ConfigMainTest {
	
	@Reference
	private IUserRpcService userRpcService;
	
	@Test
	public void test(){
		/*List<com.idea.maven.rpc.api.vo.user.User> userList = userRpcService.findUserAll();
		for(com.idea.maven.rpc.api.vo.user.User user : userList){
			System.out.println("userId:"+user.getId());
		}*/
		
		System.out.println("dataSource:"+context.getBean("dataSource"));
	}
	
	
	
}
