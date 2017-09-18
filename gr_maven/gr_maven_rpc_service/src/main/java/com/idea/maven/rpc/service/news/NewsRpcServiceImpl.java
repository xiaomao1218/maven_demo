package com.idea.maven.rpc.service.news;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.idea.maven.commons.utils.Utils;
import com.idea.maven.dao.vo.NewsVo;
import com.idea.maven.rpc.api.news.INewsRpcService;
import com.idea.maven.rpc.api.vo.news.NewsRpcVo;
import com.idea.maven.service.INewsService;

@Service
public class NewsRpcServiceImpl implements INewsRpcService {

	@Resource(name = "newsService")
	private INewsService newsService;
	
	@Override
	public List<NewsRpcVo> findNewsByPage(Map<String, Object> params) {
		List<NewsVo> newsVoList = newsService.findNewsByPage(params);
		List<NewsRpcVo> newsRpcVoList = new ArrayList<NewsRpcVo>();
		if(newsVoList != null && newsVoList.size() > 0){
			Utils.copyListObject(newsVoList, newsRpcVoList, NewsRpcVo.class);
		}
		return newsRpcVoList;
	}

	@Override
	public int saveNews(NewsRpcVo rpcVo) {
		if(rpcVo != null){
			NewsVo vo = new NewsVo();
			Utils.copyObject(rpcVo, vo);
			return newsService.saveNews(vo);
		}
		return 0;
	}

	@Override
	public int updateNews(NewsRpcVo rpcVo) {
		if(rpcVo != null){
			NewsVo vo = new NewsVo();
			Utils.copyObject(rpcVo, vo);
			return newsService.updateNews(vo);
		}
		return 0;
	}

	@Override
	public int delNews(BigInteger id) {
		return newsService.delNews(id);
	}

}
