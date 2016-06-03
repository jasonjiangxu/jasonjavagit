package com.centaline.business.entity;

import java.util.Date;

import com.centaline.core.model.BaseEntity;

/**
 * ת��
 * @author Administrator
 *
 */
public class TTransferAccount extends BaseEntity {
	/* ת������   */
	private Date transferDate;
	/* ת�����  */
	private String transferName;
	/* ת�˽��   */
	private String amount;
	/* ת���˻�   */
	private String outAccount;
	/* ת���˻�   */
	private String inAccount;
	
	public Date getTransferDate() {
		return transferDate;
	}
	public void setTransferDate(Date transferDate) {
		this.transferDate = transferDate;
	}
	public String getTransferName() {
		return transferName;
	}
	public void setTransferName(String transferName) {
		this.transferName = transferName;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getOutAccount() {
		return outAccount;
	}
	public void setOutAccount(String outAccount) {
		this.outAccount = outAccount;
	}
	public String getInAccount() {
		return inAccount;
	}
	public void setInAccount(String inAccount) {
		this.inAccount = inAccount;
	}
}
