package com.centaline.business.entity;

import com.centaline.core.model.BaseEntity;

/**
 * �˻�
 * @author Administrator
 *
 */
public class TAccount extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1492354250539019816L;
	/* �˻����   */
	private String accountCode;
	/* �˻����   */
	private String accountName;
	/* �˻�����   */
	private String accountType;
	/* ��ʼ���   */
	private String initAmount;
	
	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getInitAmount() {
		return initAmount;
	}
	public void setInitAmount(String initAmount) {
		this.initAmount = initAmount;
	}
	
}
