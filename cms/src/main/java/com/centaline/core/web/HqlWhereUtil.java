package com.centaline.core.web;

import java.util.List;

/**
 * Hql查询where条件
 * @author Administrator
 *
 */
public class HqlWhereUtil {

	private String[] whereColumn; //参与或者条件模糊匹配的列 对象的属性
	
	private String condition;  //页面传入的条件 逗号隔开  匹配所有whereColumn字段 的 和whereColumn一起用 
	
	private List<Condition> conditionList;  //对象属性条件 and条件 
	
	private List<Sort> sortList; //排序
	
	private String hql;//hql语句  hql 和 objParames 一起使用
	
	private Object[] objParames;//hql后面参数  hql 和 objParames 一起使用
	
	public String getHql() {
		return hql;
	}

	public void setHql(String hql) {
		this.hql = hql;
	}

	public Object[] getObjParames() {
		return objParames;
	}

	public void setObjParames(Object[] objParames) {
		this.objParames = objParames;
	}

	public List<Sort> getSortList() {
		return sortList;
	}

	public void setSortList(List<Sort> sortList) {
		this.sortList = sortList;
	}

	public String[] getWhereColumn() {
		return whereColumn;
	}

	public void setWhereColumn(String[] whereColumn) {
		this.whereColumn = whereColumn;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public List<Condition> getConditionList() {
		return conditionList;
	}

	public void setConditionList(List<Condition> conditionList) {
		this.conditionList = conditionList;
	}
	
}
