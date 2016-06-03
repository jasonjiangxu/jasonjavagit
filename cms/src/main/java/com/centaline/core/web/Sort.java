package com.centaline.core.web;

/**
 * 
 * @ClassName: Sort 
 * @Description: TODO(排序) 
 * @author 姜旭(JasonJiang)
 * @date 2015年8月15日 下午8:00:40 
 *
 */
public class Sort {
	
	private String sortProperty; //排序字段
	private String sortRule; //排序规则
	
	public String getSortProperty() {
		return sortProperty;
	}
	public void setSortProperty(String sortProperty) {
		this.sortProperty = sortProperty;
	}
	public String getSortRule() {
		return sortRule;
	}
	public void setSortRule(String sortRule) {
		this.sortRule = sortRule;
	}
	
}
