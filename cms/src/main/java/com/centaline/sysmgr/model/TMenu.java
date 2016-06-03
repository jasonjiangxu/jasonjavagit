package com.centaline.sysmgr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.centaline.core.model.BaseEntity;
import com.centaline.core.util.Common;

/**
 * 
 * @ClassName: TMenu 
 * @Description: TODO(菜单对象) 
 * @author 姜旭(JasonJiang)
 * @date 2015年6月26日 上午10:44:04 
 *
 */
@Entity
@Table(name="T_MENU")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class TMenu extends BaseEntity{
	
	private static final long serialVersionUID = 2571507163921264835L;
	
	/* 菜单编码  */
	@Column(name="C_CODE",length=64)
	private String code;
	/* 菜单名称  */
	@Column(name="C_NAME",length=64)
	private String name;
	/* 父级菜单  */
	@Column(name="C_PARENT_CODE",length=64)
	private String parentCode;
	/* 菜单级别  */
	@Column(name="C_LEVEL")
	private Integer level;
	/* 菜单URL  */
	@Column(name="C_URL",length=125)
	private String url;
	/* 菜单图标  */
	@Column(name="C_ICON",length=32)
	private String icon;
	/* 排序  */
	@Column(name="C_SORT")
	private Integer sort;
	/* 菜单拼音  */
	@Column(name="C_SPELL",length=32)
	private String spell;
	
	@Override
	public String toString() {
		return super.toString();
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getSpell() {
		return spell;
	}
	public void setSpell(String spell) {
		this.spell = spell;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		if(!Common.isEmptStr(name)){
			this.setSpell(Common.getPYM(name));
		}
	}
	public String getParentCode() {
		return parentCode;
	}
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
}
