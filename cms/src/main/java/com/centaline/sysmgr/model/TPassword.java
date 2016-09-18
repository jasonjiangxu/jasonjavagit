package com.centaline.sysmgr.model;

import com.jx.core.model.BaseEntity;

/**
 * 
 * @ClassName: TPassword 
 * @Description: TODO(密码) 
 * @author 姜旭(JasonJiang)
 * @date 2015年6月26日 上午10:44:45 
 *
 */
public class TPassword extends BaseEntity {
	
	private static final long serialVersionUID = 7880887724381578258L;
	
	/* 密码  */
	private String pwd;
	/* 标记  */
	private char flg;
	/* 关联用户 编号 */
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
