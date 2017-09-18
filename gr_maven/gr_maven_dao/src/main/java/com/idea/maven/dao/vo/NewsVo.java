package com.idea.maven.dao.vo;

import java.io.Serializable;
import java.math.BigInteger;

public class NewsVo implements Serializable {
	 
	private static final long serialVersionUID = 4985554460201255270L;
	
	private BigInteger id;
	private String newsTitle;
	private String newsContent;
	private String author;
	private Short status;
	private Integer createTime;
	private Long heartNum;
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getNewsTitle() {
		return newsTitle;
	}
	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}
	public String getNewsContent() {
		return newsContent;
	}
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Short getStatus() {
		return status;
	}
	public void setStatus(Short status) {
		this.status = status;
	}
	public Integer getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}
	public Long getHeartNum() {
		return heartNum;
	}
	public void setHeartNum(Long heartNum) {
		this.heartNum = heartNum;
	}

}
