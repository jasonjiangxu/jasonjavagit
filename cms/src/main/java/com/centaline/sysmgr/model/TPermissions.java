package com.centaline.sysmgr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.centaline.core.model.BaseEntity;

@Entity
@Table(name="T_PERMISSION")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class TPermissions extends BaseEntity {

	private static final long serialVersionUID = -5711571420124495793L;

	/* 权限名称 */
	@Column(name="C_PERMISSION_NAME",length=64)
	private String permissionName;
	/* 权限类型  */
	@Column(name="C_PERMISSION_TYPE",length=1)
	private char permissionType;
	/* 权限名称拼音  */
	@Column(name="C_SPELL",length=32)
	private String spell;
	
	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	public char getPermissionType() {
		return permissionType;
	}
	public void setPermissionType(char permissionType) {
		this.permissionType = permissionType;
	}
	public String getSpell() {
		return spell;
	}
	public void setSpell(String spell) {
		this.spell = spell;
	}
}
