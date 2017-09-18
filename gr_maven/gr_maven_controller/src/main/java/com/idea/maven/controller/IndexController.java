package com.idea.maven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;
import com.idea.maven.rpc.api.IUserRpcService;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@Reference
	private IUserRpcService userRpcService;
	
	@RequestMapping("/test")
	public void test(){
		/*List<UserVo> userList = userRpcService.findUserAll();
		for(User user : userList){
			System.out.println(user.getId());
		}*/
	}
	
	@RequestMapping("/index")
	public String indexTest(){
		return "test/index";
	}
	
	@RequestMapping("/login")
	public String login(){
		return "login/login";
	}
}
