package com.centaline.sysmgr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.centaline.core.model.BaseFKEntity;

@Entity
@Table(name="FK_GROUP_USER")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class FKGroupUser extends BaseFKEntity{
	private static final long serialVersionUID = 8856109137222082836L;
	
	@Column(name="FK_GROUP_ID",length=64)
	private String groupFk;
	@Column(name="FK_USER_ID",length=64)
	private String userFk;
	public String getGroupFk() {
		return groupFk;
	}
	public void setGroupFk(String groupFk) {
		this.groupFk = groupFk;
	}
	public String getUserFk() {
		return userFk;
	}
	public void setUserFk(String userFk) {
		this.userFk = userFk;
	}
}
