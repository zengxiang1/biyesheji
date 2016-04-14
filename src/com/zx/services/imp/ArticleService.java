package com.zx.services.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.zx.model.Article;
import com.zx.model.ArticleDAO;
import com.zx.service.IArticleService;
@Component
public class ArticleService implements IArticleService{

	@Resource
	private ArticleDAO articleDao;
	/**
	 * @method: 查询所有文章信息
	 */
	public List<Article> getAllWzxx() {
		//使用dao 查询所有的文章信息
		List<Article> articles = articleDao.findAll();
////		创建返回值json
//		JSONObject returnJSON = new JSONObject();
//		JSONArray jsonArray = new JSONArray();
////		遍历所有从数据库取到的值 放入json对象
//		for(Article article: articles){
//			JSONObject json = new JSONObject();
//			json.accumulate("ids",article.getIds());
//			json.accumulate(articleDao.TITLES,article.getTitles());
//			json.accumulate(articleDao.SHOTTITLES,article.getShottitles());
//			json.accumulate(articleDao.TITLECOLOR,article.getOrigins());
//			json.accumulate(articleDao.VISITTOTALS,article.getVisittotals());
//			json.accumulate(articleDao.MENUS,article.getMenus());
//			json.accumulate(articleDao.CLASSES,article.getClasses());
//			json.accumulate(articleDao.PICS,article.getPics());
//			json.accumulate(articleDao.SETTOPS,article.getSettops());
//			json.accumulate(articleDao.PICURLS,article.getPicurls());
//			json.accumulate(articleDao.CONTENTS,article.getContents());
//			json.accumulate("releasedates",article.getReleasedates());
//			json.accumulate("releasesysdate",article.getReleasesysdate());
//			json.accumulate(articleDao.USERNAMES, article.getUsernames());
//			jsonArray.add(json);
//		}
//		returnJSON.accumulate("articles",jsonArray);
		for(Article article: articles){
			article.setContents(article.getContents().substring(0, 75)+"....");
		}
		return articles;
	}

	public boolean delArticleById(Integer id) {
		return false;
	}

	public boolean addArticle(Article article) {
		return false;
	}

	public boolean update(Article article) {
		return false;
	}

}
