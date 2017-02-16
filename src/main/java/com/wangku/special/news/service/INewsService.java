/**
 * 
 */
package com.wangku.special.news.service;

import java.util.List;
import java.util.Map;

import com.wangku.special.news.model.News;

/**
 * @author Sunjian
 * @version 1.0
 * @since jdk1.7
 */
public interface INewsService {
	public List<News> getHistory(Map<String,Object> map);
	public News getNewsById(int id);
	public void updateById(News news);
	public void delete(Map<String,Object> map);
	public void insert(News news);
}
