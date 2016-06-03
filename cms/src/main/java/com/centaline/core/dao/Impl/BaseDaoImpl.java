package com.centaline.core.dao.Impl;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.centaline.core.dao.IBaseDao;
import com.centaline.core.enums.QueryConditionEnum;
import com.centaline.core.util.Common;
import com.centaline.core.web.Condition;
import com.centaline.core.web.HqlWhereUtil;
import com.centaline.core.web.PageUtil;
import com.centaline.core.web.Sort;

/**
 * 
 * @ClassName: BaseDao 
 * @Description: TODO(封装基本Dao层) 
 * @author 姜旭(JasonJiang)
 * @date 2015年8月15日 下午3:32:16 
 *
 */
public class BaseDaoImpl<T>  extends HibernateDaoSupport  implements IBaseDao<T> {
	protected Logger log = Logger.getLogger(this.getClass());
	
	/**
	 * 
	 * @Title: insertObject 
	 * @Description: TODO(保存文件) 
	 * @param @param obj    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年8月15日 下午3:41:40
	 *
	 */
	public T insertObject(T obj) throws HibernateException{
		this.getHibernateTemplate().save(obj);
		log.debug("保存对象");
		return obj;
	}
	
	/**
	 * 
	 * @Title: insertOrUpdate 
	 * @Description: TODO(保存或更新) 
	 * @param @param obj    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年8月15日 下午3:44:06
	 *
	 */
	public void insertOrUpdateObj(T obj) throws HibernateException{
		log.debug("保存更新对象");
		this.getHibernateTemplate().saveOrUpdate(obj);
	}
	
	/**
	 * 
	 * @Title: updateObject 
	 * @Description: TODO(更新) 
	 * @param @param obj    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年8月15日 下午3:44:43
	 *
	 */
	public void updateObject(T obj) throws HibernateException{
		log.debug("更新对象");
		this.getHibernateTemplate().update(obj);
	}
	
	/**
	 * 
	 * @Title: deleteObject 
	 * @Description: TODO(删除对象) 
	 * @param @param obj    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年8月15日 下午3:45:41
	 *
	 */
	public void deleteObject(T obj)  throws HibernateException{
		log.debug("删除对象");
		this.getHibernateTemplate().delete(obj);
	}
	
	/**
	 * 
	 * @Title: mergeObject 
	 * @Description: TODO() 
	 * @param @param obj
	 * @param @return    设定文件 
	 * @return T    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年8月15日 下午6:16:31
	 *
	 */
	public T mergeObject(T obj)  throws HibernateException{
		log.debug("merge对象");
		return this.getHibernateTemplate().merge(obj);
	}
	
	/**
	 * 
	 * @Title: getObj 
	 * @Description: TODO(get方式查询) 
	 * @param @param entityClass
	 * @param @param id
	 * @param @return    设定文件 
	 * @return T    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年8月15日 下午6:18:03
	 *
	 */
	public T getObj(Class<T> entityClass, Serializable id)  throws HibernateException{
		log.debug("根据get方式查询对象,ID为："+id);
		return this.getHibernateTemplate().get(entityClass, id);
	}
	
	/**
	 * 
	 * @Title: findObj 
	 * @Description: TODO(load方式查询) 
	 * @param @param entityClass
	 * @param @param id
	 * @param @return    设定文件 
	 * @return T    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年8月15日 下午6:20:27
	 *
	 */
	public T loadObj(Class<T> entityClass, Serializable id) throws HibernateException{
		log.debug("根据load方式查询对象,ID为："+id);
		return this.getHibernateTemplate().load(entityClass, id);
	}
	
	/**
	 * 
	 * @Title: selectByHql 
	 * @Description: TODO(根据HQL查询) 
	 * @param @param hql
	 * @param @return    设定文件 
	 * @return List<T>    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年8月15日 下午6:26:37
	 *
	 */
	@SuppressWarnings("unchecked")
	public List<T> selectByHql(String hql) throws HibernateException{
		log.debug("根据HQL语句查询："+hql);
		return (List<T>) this.getHibernateTemplate().find(hql);
	}
	
	
	
	/**
	 * 
	 * @Title: selectObjByCondition 
	 * @Description: TODO(分页查询) 
	 * @param @param cl
	 * @param @param conditions
	 * @param @param sorts
	 * @param @param beginpos
	 * @param @param count
	 * @param @return    设定文件 
	 * @return List<T>    返回类型 
	 * @throws 
	 *
	 * @author 姜旭(JasonJiang)
	 * @date 2015年8月15日 下午8:11:10
	 *
	 */
	public List<T> selectObjByCondition(final Class<T> cl,final HqlWhereUtil hqlwhere) throws HibernateException{
		@SuppressWarnings({ "unchecked"})
		List<T> list=(List<T>) this.getHibernateTemplate().executeWithNativeSession(new HibernateCallback<List<T>>() {
			public List<T> doInHibernate(Session session) throws HibernateException{
				Criteria cri = session.createCriteria(cl);
				if(Common.notEmptyList(hqlwhere.getConditionList())){ //条件
					for(Condition c:hqlwhere.getConditionList()){
						if(Common.isEmptStr(c.getProperty()) || Common.isNullObj(c.getValue())){//条件为空 继续循环下一个
							continue;
						}
						Common.addCondition(cri,c);//添加参数
					}
				}
				
				if(Common.notEmptyList(hqlwhere.getSortList())){ //排序
					for(Sort c:hqlwhere.getSortList()){
						if(QueryConditionEnum.DESC.getCode().equals(c.getSortRule())){
							cri.addOrder(Order.desc(c.getSortProperty()));
						}else if(QueryConditionEnum.ASC.getCode().equals(c.getSortRule())){
							cri.addOrder(Order.asc(c.getSortProperty()));
						}
					}
				}
				return cri.list();
				
			}
			
		});
		return list;
	}

	/**
	 * 根据对象查询符合条件的分页列表 
	 */
	@Override
	public PageUtil<T> selectPageListByCriteria(final Class<T> cl, final PageUtil<T> pageUtil, final HqlWhereUtil hqlwhere) throws HibernateException {
		this.getHibernateTemplate().executeWithNativeSession(new HibernateCallback<List<T>>() {
			public List<T> doInHibernate(Session session) throws HibernateException{
				Criteria cri = session.createCriteria(cl);
				if(hqlwhere!=null){
					
					//条件
					if(Common.notEmptyList(hqlwhere.getConditionList())){ //条件
						for(Condition c:hqlwhere.getConditionList()){
							if(Common.isEmptStr(c.getProperty()) || Common.isNullObj(c.getValue())){//条件为空 继续循环下一个
								continue;
							}
							Common.addCondition(cri,c);//添加参数
						}
					}
					
					//记录数
					Long rowCount = (Long) cri.setProjection(Projections.rowCount()).uniqueResult(); //分页总记录数
					cri.setProjection(null);
					pageUtil.setTotal(rowCount.intValue());
					
					//排序
					if(Common.notEmptyList(hqlwhere.getSortList())){ //排序
						for(Sort c:hqlwhere.getSortList()){
							if(QueryConditionEnum.DESC.getCode().equals(c.getSortRule())){
								cri.addOrder(Order.desc(c.getSortProperty()));
							}else if(QueryConditionEnum.ASC.getCode().equals(c.getSortRule())){
								cri.addOrder(Order.asc(c.getSortProperty()));
							}
						}
					}
				}
				
				cri.setFirstResult(pageUtil.getStart());
				cri.setMaxResults(pageUtil.getLimit());
				@SuppressWarnings("unchecked")
				List<T> list=cri.list();
				pageUtil.setRows(list);
				return list;
			}
			
		});
		return pageUtil;
	}

	/**
	 * 根据HQL查询符合条件的分页列表 
	 */
	@Override
	public PageUtil<T> selectPageListByHql(final String hql, final PageUtil<T> pageUtil,final Object[] parames)throws HibernateException {
		if(StringUtils.isNotEmpty(hql)){
			List<T> list=(List<T>) this.getHibernateTemplate().executeWithNativeSession(new HibernateCallback<List<T>>() {
				@SuppressWarnings("unchecked")
				public List<T> doInHibernate(Session session) throws HibernateException{
					Query query=session.createQuery(hql);
					int index=0;
					for(Object o:parames){
						query.setParameter(index, o);
						index++;
					}
					query.setFirstResult(pageUtil.getStart());
					query.setMaxResults(pageUtil.getLimit());
					return query.list();
				}
			});
			pageUtil.setRows(list);
			int total=selectCountByHql(hql,parames);
			pageUtil.setTotal(total);
		}
		return pageUtil;
	}

	/**
	 * 根据HQL查询符合条件的列表
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<T> selectListByHql(String hql,Object[] parames) throws HibernateException {
		return (List<T>) this.getHibernateTemplate().find(hql, parames);
	}

	/**
	 * 根据HQL查询符合条件的记录数
	 */
	@Override
	public int selectCountByHql(final String hql,final Object[] parames) throws HibernateException {
		Integer ct = this.getHibernateTemplate().executeWithNativeSession(new HibernateCallback<Integer>() {
			public Integer doInHibernate(Session session) throws HibernateException{
				
				Query query=session.createQuery("SELECT COUNT(*) as ct "+hql);
				int index=0;
				for(Object o:parames){
					query.setParameter(index, o);
					index++;
				}
				return ((Long)query.iterate().next()).intValue();
			}
		});
		return ct;
	}
}
