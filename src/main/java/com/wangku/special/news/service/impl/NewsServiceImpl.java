/**
 * 
 */
package com.wangku.special.news.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wangku.special.news.dao.INewsDAO;
// import com.wangku.special.news.dao.impl.NewsImpl;
import com.wangku.special.news.model.News;
import com.wangku.special.news.service.INewsService;

// import com.wangku.wjf.common.datasource.TradingDataSource;

/**
 * @author Sunjian
 * @version 1.0
 * @since jdk1.7
 */
@Service("newsService")
public class NewsServiceImpl implements INewsService {
	@Resource
	INewsDAO iNewsDAO;

	/*
	 * (non-Javadoc)
	 * @see com.wangku.special.news.service.INewsService#getHistory(java.util.Map)
	 */
	@Override
	public List<News> getHistory(Map<String, Object> map) {
		return iNewsDAO.getHistory(map);
	}

	/*
	 * (non-Javadoc)
	 * @see com.wangku.special.news.service.INewsService#delete(java.util.Map)
	 */
	@Override
	public void delete(Map<String, Object> map) {
		iNewsDAO.delete(map);
	}

	/*
	 * (non-Javadoc)
	 * @see com.wangku.special.news.service.INewsService#insert(com.wangku.special.news.model.News)
	 */
	@Override
	public void insert(News news) {
		iNewsDAO.insert(news);
	}

	/* (non-Javadoc)
	 * @see com.wangku.special.news.service.INewsService#getNewsById(int)
	 */
	@Override
	public News getNewsById(int id) {
		return iNewsDAO.getNewsById(id);
	}

	/* (non-Javadoc)
	 * @see com.wangku.special.news.service.INewsService#updateById(com.wangku.special.news.model.News)
	 */
	@Override
	public void updateById(News news) {
		iNewsDAO.updateById(news);
		
	}

}
