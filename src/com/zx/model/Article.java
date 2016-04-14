package com.zx.model;

import java.util.Date;

/**
 * Article entity. @author MyEclipse Persistence Tools
 */

public class Article implements java.io.Serializable {

	// Fields

	private Integer ids;
	private String titles;
	private String shottitles;
	private String titlecolor;
	private String origins;
	private Integer visittotals;
	private Integer menus;
	private Integer classes;
	private Integer settops;
	private Integer pics;
	private String picurls;
	private String contents;
	private Date releasedates;
	private Date releasesysdate;
	private String usernames;

	// Constructors

	/** default constructor */
	public Article() {
	}

	/** full constructor */
	public Article(String titles, String shottitles, String titlecolor,
			String origins, Integer visittotals, Integer menus,
			Integer classes, Integer settops, Integer pics, String picurls,
			String contents, Date releasedates, Date releasesysdate,
			String usernames) {
		this.titles = titles;
		this.shottitles = shottitles;
		this.titlecolor = titlecolor;
		this.origins = origins;
		this.visittotals = visittotals;
		this.menus = menus;
		this.classes = classes;
		this.settops = settops;
		this.pics = pics;
		this.picurls = picurls;
		this.contents = contents;
		this.releasedates = releasedates;
		this.releasesysdate = releasesysdate;
		this.usernames = usernames;
	}

	// Property accessors

	public Integer getIds() {
		return this.ids;
	}

	public void setIds(Integer ids) {
		this.ids = ids;
	}

	public String getTitles() {
		return this.titles;
	}

	public void setTitles(String titles) {
		this.titles = titles;
	}

	public String getShottitles() {
		return this.shottitles;
	}

	public void setShottitles(String shottitles) {
		this.shottitles = shottitles;
	}

	public String getTitlecolor() {
		return this.titlecolor;
	}

	public void setTitlecolor(String titlecolor) {
		this.titlecolor = titlecolor;
	}

	public String getOrigins() {
		return this.origins;
	}

	public void setOrigins(String origins) {
		this.origins = origins;
	}

	public Integer getVisittotals() {
		return this.visittotals;
	}

	public void setVisittotals(Integer visittotals) {
		this.visittotals = visittotals;
	}

	public Integer getMenus() {
		return this.menus;
	}

	public void setMenus(Integer menus) {
		this.menus = menus;
	}

	public Integer getClasses() {
		return this.classes;
	}

	public void setClasses(Integer classes) {
		this.classes = classes;
	}

	public Integer getSettops() {
		return this.settops;
	}

	public void setSettops(Integer settops) {
		this.settops = settops;
	}

	public Integer getPics() {
		return this.pics;
	}

	public void setPics(Integer pics) {
		this.pics = pics;
	}

	public String getPicurls() {
		return this.picurls;
	}

	public void setPicurls(String picurls) {
		this.picurls = picurls;
	}

	public String getContents() {
		return this.contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Date getReleasedates() {
		return this.releasedates;
	}

	public void setReleasedates(Date releasedates) {
		this.releasedates = releasedates;
	}

	public Date getReleasesysdate() {
		return this.releasesysdate;
	}

	public void setReleasesysdate(Date releasesysdate) {
		this.releasesysdate = releasesysdate;
	}

	public String getUsernames() {
		return this.usernames;
	}

	public void setUsernames(String usernames) {
		this.usernames = usernames;
	}

}