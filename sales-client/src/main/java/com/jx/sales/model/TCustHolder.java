package com.jx.sales.model;

import com.jx.core.model.BaseEntity;

public class TCustHolder extends BaseEntity {
	
	private static final long serialVersionUID = -9037414666770932085L;
	/* 客户编号  */
	private String code;
	/* 经纪人  */
	private String agentId;
	/* 所属店组  */
	private String groupId;
	/* 所属片区  */
	private String areaId;
	/* 所属战区  */
	private String warzoneId;
	/* 所属大区  */
	private String bigAreaId;
	/* 共享池层级 0: 非共享池客户， 1 ：店组共享池客户， 2： 片区共享池客户  ，3：战区共享池客户 4：大区共享池客户  */
	private char poollevel;
	/* 是否原经纪人：Y 是 N 否 */
	private char isoriCust;
	/* 排序  */
	private Integer sort;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getWarzoneId() {
		return warzoneId;
	}
	public void setWarzoneId(String warzoneId) {
		this.warzoneId = warzoneId;
	}
	public String getBigAreaId() {
		return bigAreaId;
	}
	public void setBigAreaId(String bigAreaId) {
		this.bigAreaId = bigAreaId;
	}
	public char getPoollevel() {
		return poollevel;
	}
	public void setPoollevel(char poollevel) {
		this.poollevel = poollevel;
	}
	public char getIsoriCust() {
		return isoriCust;
	}
	public void setIsoriCust(char isoriCust) {
		this.isoriCust = isoriCust;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
}
