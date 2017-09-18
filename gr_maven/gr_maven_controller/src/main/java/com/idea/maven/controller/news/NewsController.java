package com.idea.maven.controller.news;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.idea.maven.rpc.api.news.INewsRpcService;
import com.idea.maven.rpc.api.vo.news.NewsRpcVo;

@Controller
@RequestMapping("/news")
public class NewsController {
	
	@Reference
	private INewsRpcService newsRpcService;
	
	@RequestMapping("/findNewsByPage")
	@ResponseBody
	public List<NewsRpcVo> findNewsByPage(@RequestParam Integer pageNum, Integer pageSize){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("start", pageNum);
		params.put("size", pageSize);
		return newsRpcService.findNewsByPage(params);
	}
}
