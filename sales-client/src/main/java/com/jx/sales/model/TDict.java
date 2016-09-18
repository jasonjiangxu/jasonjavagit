package com.jx.sales.model;

import com.jx.core.model.BaseEntity;

public class TDict extends BaseEntity{

	private static final long serialVersionUID = -338635772405537426L;
	
	private String code;
	private String type;
	private char isdefault;
	private String name;
	private String tag;
	/* 排序  */
	private Integer sort;
	private String spell;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public char getIsdefault() {
		return isdefault;
	}
	public void setIsdefault(char isdefault) {
		this.isdefault = isdefault;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public String getSpell() {
		return spell;
	}
	public void setSpell(String spell) {
		this.spell = spell;
	}
}
