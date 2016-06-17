package com.centaline.sysmgr.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.centaline.core.model.BaseEntity;
import com.centaline.core.util.Common;

import net.sf.json.JSONObject;

/**
 * 
 * @ClassName: TUser 
 * @Description: TODO(用户对象) 
 * @author 姜旭(JasonJiang)
 * @date 2015年6月26日 上午10:43:40 
 *
 */
@Entity
@Table(name="T_USER")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class TUser extends BaseEntity{
	
	private static final long serialVersionUID = 3407373260440680543L;
	
	/* 登录名  */
	@Column(name="C_LOGIN_NAME",length=64)
	private String loginName;
	/* 昵称  */
	@Column(name="C_NIC_NAME",length=64)
	private String nicName;
	/* 用户名  */
	@Column(name="C_USER_NAME",length=64)
	private String userName;
	/* 性别  */
	@Column(name="C_SEX",length=1)
	private char sex;
	/* 编码 工号 */
	@Column(name="C_CODE",length=64)
	private String code;
	/* 生日 */
	@Column(name="C_BIRTH_DAY")
	private Date birthDay;
	/* 冗余条件字段 开始时间 不是数据库字段 */
	@Transient
	private String beginBirthDay;
	/* 冗余条件字段 结束时间 不是数据库字段 */
	@Transient
	private String endBirthDay;
	
	/* 用户状态 */
	@Column(name="C_STATUS",length=1)
	private char status;
	/* 菜单拼音  */
	@Column(name="C_SPELL",length=32)
	private String spell;
	
	@Override
	public String toString() {
		JSONObject json=JSONObject.fromObject(this);
		return json.toString();
	}
	
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	public String getBeginBirthDay() {
		return beginBirthDay;
	}

	public void setBeginBirthDay(String beginBirthDay) {
		this.beginBirthDay = beginBirthDay;
	}

	public String getEndBirthDay() {
		return endBirthDay;
	}

	public void setEndBirthDay(String endBirthDay) {
		this.endBirthDay = endBirthDay;
	}

	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getNicName() {
		return nicName;
	}
	public void setNicName(String nicName) {
		this.nicName = nicName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
		if(!Common.isEmptStr(userName)){
			this.setSpell(Common.getPYM(userName));
		}
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public String getSpell() {
		return spell;
	}
	public void setSpell(String spell) {
		this.spell = spell;
	}
}
