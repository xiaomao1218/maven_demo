<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<body>
<h2>Hello Redis!</h2>
	<div>
		<h2>新增用户</h2>
		<form action="user/add">
			<div>
				<span>ID:</span>
				<input type="text" name="id" value=""/>
			</div>
			<div>
				<span>姓名:</span>
				<input type="text" name="userName" value=""/>
			</div>
			<div>
				<span>密码:</span>
				<input type="password" name="password" value=""/>
			</div>
			<div>
				<input type="submit" value="提交"/>
			</div>
		</form>
	</div>
	<div>
		<h2>查询用户</h2>
		<form action="user/findUserById">
			<div>
				<span>ID:</span>
				<input type="text" name="id" value=""/>
			</div>
			<div>
				<input type="submit" value="提交"/>
			</div>
		</form>
	</div>
</body>
</html>
