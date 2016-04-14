package com.zx.service;

import java.util.List;

import com.zx.model.Article;

import net.sf.json.JSONObject;

public interface IArticleService {
	public List<Article> getAllWzxx();
	public boolean delArticleById(Integer id);
	public boolean addArticle(Article article);
	public boolean update(Article article);
}
