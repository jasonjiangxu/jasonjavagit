package com.centaline.sysmgr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.centaline.core.model.BaseEntity;

/**
 * 角色对象
 * @author Administrator
 *
 */
@Entity
@Table(name="T_ROLE")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class TRole extends BaseEntity {

	private static final long serialVersionUID = -5028950770905613284L;
	
	/* 角色拼音  */
	@Column(name="C_SPELL",length=32)
	private String spell;
	
	/* 角色名称  */
	@Column(name="C_ROLE_NAME",length=64)
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
