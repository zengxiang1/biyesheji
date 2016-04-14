package com.zx.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.opensymphony.xwork2.ActionSupport;
import com.zx.model.Article;
import com.zx.services.imp.ArticleService;

@Component
public class ArticleAction extends ActionSupport{
	private List<Article> list;
     public List<Article> getList() {
		return list;
	}
	public void setList(List<Article> list) {
		this.list = list;
	}
	@Autowired
	private ArticleService articleService;
    public String getAll() throws IOException{
//    	JSONObject json = articleService.getAllWzxx();
//    	HttpServletResponse response = ServletActionContext.getResponse();
//    	response.setHeader("Content-type", "text/html;charset=UTF-8");  
//    	PrintWriter out = response.getWriter();
//    	out.write(json.toString());
//    	out.flush();
//    	out.close();
    	list = articleService.getAllWzxx();
    	return SUCCESS;
    }
}
