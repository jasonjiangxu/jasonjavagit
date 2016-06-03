package com.centaline.sysmgr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.centaline.core.model.BaseFKEntity;

/**
 * 用户角色外键
 * @author jiangxu2
 *
 */
@Entity
@Table(name="FK_USER_ROLE")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class FKUserRole extends BaseFKEntity{
	private static final long serialVersionUID = -1840587172572982154L;
	
	@Column(name="FK_USER_ID",length=64)
	private String userFk;
	@Column(name="FK_ROLE_ID",length=64)
	private String roleFk;
	public String getUserFk() {
		return userFk;
	}
	public void setUserFk(String userFk) {
		this.userFk = userFk;
	}
	public String getRoleFk() {
		return roleFk;
	}
	public void setRoleFk(String roleFk) {
		this.roleFk = roleFk;
	}
	
}
