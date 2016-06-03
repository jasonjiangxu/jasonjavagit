package com.centaline.sysmgr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.centaline.core.model.BaseEntity;

/**
 * 
 * @ClassName: TPassword 
 * @Description: TODO(密码) 
 * @author 姜旭(JasonJiang)
 * @date 2015年6月26日 上午10:44:45 
 *
 */
@Entity
@Table(name="T_PASSWORD")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class TPassword extends BaseEntity {
	
	private static final long serialVersionUID = 7880887724381578258L;
	
	/* 密码  */
	@Column(name="C_PWD",length=64)
	private String pwd;
	/* 标记  */
	@Column(name="C_FLG",length=1)
	private char flg;
	/* 关联用户 编号 */
	@Column(name="FK_USER_ID",length=64)//外键为sut_id，与student中的id关联
	private String userFk;
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public char getFlg() {
		return flg;
	}
	public void setFlg(char flg) {
		this.flg = flg;
	}
	public String getUserFk() {
		return userFk;
	}
	public void setUserFk(String userFk) {
		this.userFk = userFk;
	}
}
