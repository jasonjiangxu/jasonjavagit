package com.centaline.sysmgr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.centaline.core.model.BaseFKEntity;

@Entity
@Table(name="FK_PERMISSION_MENU")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class FKPermissionMenu extends BaseFKEntity{
	private static final long serialVersionUID = 3475330818096566102L;
	
	@Column(name="FK_MENU_ID",length=64)
	private String menuFk;
	@Column(name="FK_PERMISSION_ID",length=64)
	private String permissionFk;
	public String getMenuFk() {
		return menuFk;
	}
	public void setMenuFk(String menuFk) {
		this.menuFk = menuFk;
	}
	public String getPermissionFk() {
		return permissionFk;
	}
	public void setPermissionFk(String permissionFk) {
		this.permissionFk = permissionFk;
	}
	
}
