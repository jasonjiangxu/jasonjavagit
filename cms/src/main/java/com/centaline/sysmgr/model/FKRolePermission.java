package com.centaline.sysmgr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.centaline.core.model.BaseFKEntity;

@Entity
@Table(name="FK_ROLE_PERMISSION")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class FKRolePermission extends BaseFKEntity{
	private static final long serialVersionUID = -1816264616367041907L;
	
	@Column(name="FK_ROLE_ID",length=64)
	private String roleFk;
	@Column(name="FK_PERMISSION_ID",length=64)
	private String permissionFk;
	
	public String getRoleFk() {
		return roleFk;
	}
	public void setRoleFk(String roleFk) {
		this.roleFk = roleFk;
	}
	public String getPermissionFk() {
		return permissionFk;
	}
	public void setPermissionFk(String permissionFk) {
		this.permissionFk = permissionFk;
	}
}
