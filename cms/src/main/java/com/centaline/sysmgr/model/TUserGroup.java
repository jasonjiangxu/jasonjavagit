package com.centaline.sysmgr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.centaline.core.model.BaseEntity;
@Entity
@Table(name="T_USERGROUP")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class TUserGroup extends BaseEntity {

	private static final long serialVersionUID = -2318321144434315344L;
	
	@Column(name="C_GROUP_NAME",length=64)
	private String groupName;
	@Column(name="C_GROUP_CODE",length=64)
	private String groupCode;
	/* 菜单拼音  */
	@Column(name="C_SPELL",length=32)
	private String spell;
	
	@Column(name="FK_PARENT_GROUP_ID",length=64)
	private String groupFk;
	
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
