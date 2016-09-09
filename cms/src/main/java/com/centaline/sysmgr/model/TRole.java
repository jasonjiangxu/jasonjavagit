package com.centaline.sysmgr.model;

import com.jx.core.model.BaseEntity;

/**
 * 角色对象
 * @author Administrator
 *
 */
public class TRole extends BaseEntity {

	private static final long serialVersionUID = -5028950770905613284L;
	
	/* 角色拼音  */
	private String spell;
	
	/* 角色名称  */
	private String roleName;
	
	public String getSpell() {
		return spell;
	}
	public void setSpell(String spell) {
		this.spell = spell;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
