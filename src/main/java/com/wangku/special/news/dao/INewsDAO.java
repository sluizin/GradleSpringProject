/**
 * 
 */
package com.wangku.special.news.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.mybatis.spring.annotation.MapperScan;
import com.wangku.special.news.model.News;



/**
 * @author Sunjian
 * @version 1.0
 * @since jdk1.7
 */
@Repository
@MapperScan
public interface INewsDAO {
	public List<News> getHistory(Map<String,Object> map);
	public News getNewsById(int id);
	public void updateById(News news);
	public void delete(Map<String,Object> map);
	public void insert(News news);
}
