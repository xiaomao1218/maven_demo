package com.idea.maven.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import com.idea.maven.dao.vo.NewsVo;

public interface INewsService {
	
	public List<NewsVo> findNewsByPage(Map<String, Object> params);
	
	public int saveNews(NewsVo vo);
	
	public int updateNews(NewsVo vo);
	
	public int delNews(BigInteger id);
}
