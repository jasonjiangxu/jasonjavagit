package com.jx.utility.web;

/**
 * 
 * @ClassName: Condition 
 * @Description: TODO(条件) 
 * @author 姜旭(JasonJiang)
 * @date 2015年8月15日 下午4:22:57 
 *
 */
public class Condition {
	
	private String property;  //条件对应的属性
	private Object value;     //条件对应的值
	private String queryWay;    //查询方式 like eq > < 等
	private Object[] values; //in等条件的时候
	
	public Object[] getValues() {
		return values;
	}
	public void setValues(Object[] values) {
		this.values = values;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public String getQueryWay() {
		return queryWay;
	}
	public void setQueryWay(String queryWay) {
		this.queryWay = queryWay;
	}
}
