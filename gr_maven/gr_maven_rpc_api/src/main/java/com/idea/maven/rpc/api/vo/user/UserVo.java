package com.idea.maven.rpc.api.vo.user;

import java.io.Serializable;
import java.math.BigInteger;

public class UserVo implements Serializable {
	
	private static final long serialVersionUID = 2054332860895076248L;
	
	private BigInteger id;
	private String name;
	private String phone;
	private String password;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
