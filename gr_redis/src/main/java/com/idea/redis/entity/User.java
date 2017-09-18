package com.idea.redis.entity;

import java.io.Serializable;
import java.math.BigInteger;

public class User implements Serializable {
	
	private static final long serialVersionUID = -4036149402877814623L;
	
	private BigInteger id;
	private String userName;
	private Short sex;
	private String password;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Short getSex() {
		return sex;
	}
	public void setSex(Short sex) {
		this.sex = sex;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", sex=" + sex
				+ ", password=" + password + "]";
	}
	
}
