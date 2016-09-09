package com.centaline.sysmgr.model;


import com.centaline.core.model.BaseEntity;

public class TPermissions extends BaseEntity {

	private static final long serialVersionUID = -5711571420124495793L;

	/* 权限名称 */
	private String permissionName;
	/* 权限类型  */
	private char permissionType;
	/* 权限名称拼音  */
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
