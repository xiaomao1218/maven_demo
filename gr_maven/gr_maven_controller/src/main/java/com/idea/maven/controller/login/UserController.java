package com.idea.maven.controller.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.idea.maven.rpc.api.vo.user.UserVo;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/index")
	public String index(){
		return "login/login";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request, HttpServletResponse response ){
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		UserVo userVo = new UserVo();
		userVo.setName(userName);
		userVo.setPassword(password);
		Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userVo.getName(), userVo.getPassword());
        try{
        	//会跳到我们自定义的realm中
            subject.login(token);
            request.getSession().setAttribute("user", userVo);
            return "success";
        } catch(Exception e){
            e.printStackTrace();
            request.getSession().setAttribute("user", userVo);
            request.setAttribute("error", "用户名或密码错误！");
            return "login";
        }
	}
}
