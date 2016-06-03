package com.centaline.sysmgr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.centaline.core.model.BaseFKEntity;

@Entity
@Table(name="FK_USERGROUP_ROLE")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class FKGroupRole extends BaseFKEntity{
	private static final long serialVersionUID = -1900137620205535669L;
	
	@Column(name="FK_GROUP_ID",length=64)
	private String groupFk;
	@Column(name="FK_ROLE_ID",length=64)
	private String roleFk;
	public String getGroupFk() {
		return groupFk;
	}
	public void setGroupFk(String groupFk) {
		this.groupFk = groupFk;
	}
	public String getRoleFk() {
		return roleFk;
	}
	public void setRoleFk(String roleFk) {
		this.roleFk = roleFk;
	}
}
