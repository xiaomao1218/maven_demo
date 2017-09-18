package com.idea.maven.rpc.api.vo.user;

import java.io.Serializable;
import java.math.BigInteger;

public class User implements Serializable {
	
	private static final long serialVersionUID = 2054332860895076248L;
	
	private BigInteger id;
	private String name;
	private String phone;
	
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
	
}
