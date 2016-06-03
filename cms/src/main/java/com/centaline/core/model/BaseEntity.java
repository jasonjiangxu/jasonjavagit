package com.centaline.core.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;

/**
 * 基础对象 抽象公共的属性
 * @author jiangxu2
 *
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
	
	private static final long serialVersionUID = -4606172629875853524L;
	
	/* 主键 */
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(name="C_ID",length=64,nullable=false,unique=true)
	private String id;
	/* 备注 */
	@Column(name="C_REMARK")
	private String remark;
	/* 创建人编号 */
	@Column(name="C_CREATE_USER",length=32)
	private String createUser;
	/* 最近更新人编号 */
	@Column(name="C_UPDATE_USER",length=32)
	private String updateUser;
	/* 创建时间 */
	@Column(name="C_CREATE_TIME")
	private Date createTime;
	/* 最近更新时间 */
	@Column(name="C_UPDATE_TIME")
	private Date updateTime;
	/* 删除标记 是否删除  Y是 N 否 */
	@Column(name="C_DEL",length=1)
	private char delFlg;
	/* 版本控制 */
	@Version
	@Column(name="C_VERSION")  
	private Integer version;
	
	/* 冗余条件字段 开始时间 不是数据库字段 */
	@Transient
	private String beginDate;
	/* 冗余条件字段 结束时间 不是数据库字段 */
	@Transient
	private String endDate;
	
	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public char getDelFlg() {
		return delFlg;
	}

	public void setDelFlg(char delFlg) {
		this.delFlg = delFlg;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
