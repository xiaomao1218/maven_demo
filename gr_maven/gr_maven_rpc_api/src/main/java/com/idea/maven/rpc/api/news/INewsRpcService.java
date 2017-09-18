package com.idea.maven.rpc.api.news;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import com.idea.maven.rpc.api.vo.news.NewsRpcVo;

public interface INewsRpcService {
	
	public List<NewsRpcVo> findNewsByPage(Map<String, Object> params);
	
	public int saveNews(NewsRpcVo vo);
	
	public int updateNews(NewsRpcVo vo);
	
	public int delNews(BigInteger id);
}
