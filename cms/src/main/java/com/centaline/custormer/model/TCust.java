
package com.centaline.custormer.model;

import com.centaline.core.model.BaseEntity;

public class TCust extends BaseEntity{

	private static final long serialVersionUID = 7309974087529603431L;

	/* 客户编号  */
	private String code;
	/* 客户编码  */
	private String category;
	/* 客户状态  */
	private String status;
	/* 客户来源  */
	private String origin;
	/* 是否VIP  */
	private char vip;
	/* 是否掉公  */
	private char inpool;
	/* 是否导入客  */
	private char isimport;
	/* 排序  */
	private Integer sort;
	
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public char getVip() {
		return vip;
	}
	public void setVip(char vip) {
		this.vip = vip;
	}
	public char getInpool() {
		return inpool;
	}
	public void setInpool(char inpool) {
		this.inpool = inpool;
	}
	public char getIsimport() {
		return isimport;
	}
	public void setIsimport(char isimport) {
		this.isimport = isimport;
	}
}
