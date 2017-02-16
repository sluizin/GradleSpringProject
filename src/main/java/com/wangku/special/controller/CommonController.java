/**
 * 
 */
package com.wangku.special.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
// import org.springframework.validation.BindingResult;
// import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wangku.special.news.model.News;
import com.wangku.special.news.service.INewsService;

/**
 * @author Sunjian
 * @version 1.0
 * @since jdk1.7
 */
@Controller
@RequestMapping(value = "/controller")
public class CommonController {
	@Autowired
	INewsService newsService;

	/**
	 * 列表
	 * @param targetid int
	 * @param mav ModelAndView
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/show/{targetid:[\\d]+}")
	public ModelAndView getTemplateActivityList(@PathVariable int targetid, ModelAndView mav) {
		if (newsService != null) {
			Map<String, Object> map = new HashMap<String, Object>();
			if (targetid > 0) {
				map.put("targetid", targetid);
			}
			map.put("num", 100);
			List<News> newslist = newsService.getHistory(map);
			mav.getModel().put("newslist", newslist);
		}
		String filename = "/abc/index";
		System.out.println("filename:" + filename);
		mav.setViewName(filename);
		return mav;
	}

	/**
	 * 得到要修改的记录
	 * @param editid int
	 * @param mav ModelAndView
	 * @return ModelAndView
	 */
	@RequestMapping("/news/editid/{editid:[\\d]+}")
	public ModelAndView newEdit(@PathVariable int editid, ModelAndView mav) {
		News news = newsService.getNewsById(editid);
		System.out.println("findEditNews:" + news.toString());
		mav.getModel().put("editNews", news);
		return getTemplateActivityList(0, mav);
	}

	/**
	 * 添加
	 * @param news News
	 * @return String
	 */
	@RequestMapping("/news/add")
	public String newsAdd(News news) {
		System.out.println("News:" + news.toString());
		newsService.insert(news);
		return "redirect:/controller/show/0";
	}

	/**
	 * 修改
	 * @param news News
	 * @return String
	 */
	@RequestMapping("/news/editok")
	public String newseditok(News news) {
		if (news == null || news.getId() == 0) {
			System.out.println("editok:Error");
			return "redirect:/controller/show/0";
		}
		System.out.println("News:" + news.toString());
		newsService.updateById(news);
		return "redirect:/controller/show/0";
	}

	/**
	 * 删除记录
	 * @param id int
	 * @return String
	 */
	@RequestMapping("/news/deleteid/{id:[\\d]+}")
	public String newsDelete(@PathVariable int id) {
		System.out.println("DeleteNews:" + id);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		newsService.delete(map);
		return "redirect:/controller/show/0";
	}
}
