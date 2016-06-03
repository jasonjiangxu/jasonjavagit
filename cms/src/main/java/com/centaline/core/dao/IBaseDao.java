package com.centaline.core.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;

import com.centaline.core.web.HqlWhereUtil;
import com.centaline.core.web.PageUtil;

public interface IBaseDao<T> {

	public T insertObject(T obj) throws HibernateException;
	
	public void insertOrUpdateObj(T obj) throws HibernateException;
	
	public void updateObject(T obj) throws HibernateException;
	
	public void deleteObject(T obj)  throws HibernateException;
	
	public T mergeObject(T obj)  throws HibernateException;
	
	public T getObj(Class<T> entityClass, Serializable id)  throws HibernateException;
	
	public T loadObj(Class<T> entityClass, Serializable id) throws HibernateException;
	
	/*根据HQL语句查询*/
	public List<T> selectByHql(String hql) throws HibernateException;
	
	/* 根据条件排序 查询*/
	public List<T> selectObjByCondition(final Class<T> cl,final HqlWhereUtil hqlwhere) throws HibernateException;
	
	public PageUtil<T> selectPageListByCriteria(final Class<T> cl,final PageUtil<T> pageUtil,final HqlWhereUtil hqlwhere) throws HibernateException;
	
	/**
	 * 根据HQL语句分页查询
	 * @param hql
	 * @param pageUtil
	 * @param parameMap
	 * @return
	 * @throws HibernateException
	 */
	public PageUtil<T> selectPageListByHql(String hql,PageUtil<T> pageUtil,Object[] parames) throws HibernateException;
	
	/**
	 * 根据HQL查询列表
	 * @param hql
	 * @param parameMap
	 * @return
	 * @throws HibernateException
	 */
	public List<?> selectListByHql(String hql,Object[] parames) throws HibernateException;
	
	/**
	 * 根据HQL查询记录数
	 * @param hql
	 * @param parameMap
	 * @return
	 * @throws HibernateException
	 */
	public int selectCountByHql(String hql,Object[] parames) throws HibernateException;
}
