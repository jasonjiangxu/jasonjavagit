package com.centaline.business.entity;

import java.util.Date;

import com.centaline.core.model.BaseEntity;

/**
 * ���롢֧������
 * @author Administrator
 *
 */
public class TIncomePayAccount extends BaseEntity{
	
	/* �������� */
	private Date recordDate;
	
	/* ��� */
	private String name;
	
	/* ��� */
	private Double amount;
	
	/* �˻� */
	private String account;
	
	/* ���� ����/֧��   */
	private String type;
	
	/* ������*/
	private String categoryCode;

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public Date getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
