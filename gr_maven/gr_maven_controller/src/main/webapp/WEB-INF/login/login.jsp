<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
	<div>
		<form action="/user/login" method="post">
			<div>
				<span>用户名：</span>
				<input type="text" name="username"/><br>
			</div>
			<div>
				<span>密码：</span>
				<input type="password" name="password"/><br>
			</div>	
			<div>
				<button type="submit">提交</button>
			</div>	
		</form>	
	</div>
</body>
</html>