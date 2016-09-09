package com.jx.sales.model;

import com.jx.core.model.BaseEntity;

public class TCustContact extends BaseEntity {

	private static final long serialVersionUID = -4396186584530150452L;
	/* 客户编号  */
	private String code;
	/* 联系人类型  */
	private String conactType;
	/* 姓名  */
	private String name;
	/* 称谓  */
	private String title;
	/* 固话 */
	private String tele;
	/* 手机  */
	private String mobile;
	/* 微信  */
	private String wechat;
	/* 电邮  */
	private String email;
	/* 通讯地址  */
	private String address;
	/* 邮政编码  */
	private String zipCode;
	/* 户口所在地  */
	private String residentAddress;
	/* 信息来源  */
	private String sourceType;
	/* 排序  */
	private Integer sort;
	/* 菜单拼音  */
	private String spell;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getConactType() {
		return conactType;
	}
	public void setConactType(String conactType) {
		this.conactType = conactType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTele() {
		return tele;
	}
	public void setTele(String tele) {
		this.tele = tele;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getWechat() {
		return wechat;
	}
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getResidentAddress() {
		return residentAddress;
	}
	public void setResidentAddress(String residentAddress) {
		this.residentAddress = residentAddress;
	}
	public String getSourceType() {
		return sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
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
