package com.idea.maven.service.impl;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idea.maven.dao.service.news.INewsDao;
import com.idea.maven.dao.vo.NewsVo;
import com.idea.maven.service.INewsService;

@Service("newsService")
public class NewsServiceImpl implements INewsService {
	
	@Autowired
	private INewsDao newsDao;
	
	@Override
	public List<NewsVo> findNewsByPage(Map<String, Object> params) {
		return newsDao.findNewsByPage(params);
	}

	@Override
	public int saveNews(NewsVo vo) {
		return newsDao.saveNews(vo);
	}

	@Override
	public int updateNews(NewsVo vo) {
		return newsDao.updateNews(vo);
	}

	@Override
	public int delNews(BigInteger id) {
		return newsDao.delNews(id);
	}

}
