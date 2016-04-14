package com.zx.model;

import java.sql.Timestamp;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Article entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zx.model.Article
 * @author MyEclipse Persistence Tools
 */
public class ArticleDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ArticleDAO.class);
	// property constants
	public static final String TITLES = "titles";
	public static final String SHOTTITLES = "shottitles";
	public static final String TITLECOLOR = "titlecolor";
	public static final String ORIGINS = "origins";
	public static final String VISITTOTALS = "visittotals";
	public static final String MENUS = "menus";
	public static final String CLASSES = "classes";
	public static final String SETTOPS = "settops";
	public static final String PICS = "pics";
	public static final String PICURLS = "picurls";
	public static final String CONTENTS = "contents";
	public static final String USERNAMES = "usernames";

	protected void initDao() {
		// do nothing
	}

	public void save(Article transientInstance) {
		log.debug("saving Article instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Article persistentInstance) {
		log.debug("deleting Article instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	public void update(Article persistentInstance) {
		log.debug("updating Article instance");
		try {
			getHibernateTemplate().update(persistentInstance);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

	public Article findById(java.lang.Integer id) {
		log.debug("getting Article instance with id: " + id);
		try {
			Article instance = (Article) getHibernateTemplate().get(
					"com.zx.model.Article", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Article instance) {
		log.debug("finding Article instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Article instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Article as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
	

	public List findByTitles(Object titles) {
		return findByProperty(TITLES, titles);
	}

	public List findByShottitles(Object shottitles) {
		return findByProperty(SHOTTITLES, shottitles);
	}

	public List findByTitlecolor(Object titlecolor) {
		return findByProperty(TITLECOLOR, titlecolor);
	}

	public List findByOrigins(Object origins) {
		return findByProperty(ORIGINS, origins);
	}

	public List findByVisittotals(Object visittotals) {
		return findByProperty(VISITTOTALS, visittotals);
	}

	public List findByMenus(Object menus) {
		return findByProperty(MENUS, menus);
	}

	public List findByClasses(Object classes) {
		return findByProperty(CLASSES, classes);
	}

	public List findBySettops(Object settops) {
		return findByProperty(SETTOPS, settops);
	}

	public List findByPics(Object pics) {
		return findByProperty(PICS, pics);
	}

	public List findByPicurls(Object picurls) {
		return findByProperty(PICURLS, picurls);
	}

	public List findByContents(Object contents) {
		return findByProperty(CONTENTS, contents);
	}

	public List findByUsernames(Object usernames) {
		return findByProperty(USERNAMES, usernames);
	}

	public List findAll() {
		log.debug("finding all Article instances");
		try {
			String queryString = "from Article";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Article merge(Article detachedInstance) {
		log.debug("merging Article instance");
		try {
			Article result = (Article) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Article instance) {
		log.debug("attaching dirty Article instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Article instance) {
		log.debug("attaching clean Article instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ArticleDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ArticleDAO) ctx.getBean("ArticleDAO");
	}
}