package com.centaline.sysmgr.model;

import com.jx.core.model.BaseEntity;

public class TUserGroup extends BaseEntity {

	private static final long serialVersionUID = -2318321144434315344L;
	
	private String groupName;
	private String groupCode;
	/* 菜单拼音  */
	private String spell;
	
	private String groupFk;
	
	public String getGroupFk() {
		return groupFk;
	}

	public void setGroupFk(String groupFk) {
		this.groupFk = groupFk;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupCode() {
		return groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public String getSpell() {
		return spell;
	}

	public void setSpell(String spell) {
		this.spell = spell;
	}
}
