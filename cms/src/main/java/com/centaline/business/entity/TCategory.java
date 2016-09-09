package com.centaline.business.entity;

import com.jx.core.model.BaseEntity;

/**
 * ���
 * @author Administrator
 *
 */
public class TCategory extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3957097446364402046L;
	/* ���� ����/֧��   */
	private String type;
	/* ������*/
	private String categoryCode;
	/* ������ */
	private String categoryName;
	/* ���� */
	private int level;
	/* �ϼ����� */
	private String parentCode;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getParentCode() {
		return parentCode;
	}
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}
}
