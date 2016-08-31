package com.centaline.sysmgr.model;

import com.centaline.core.model.BaseEntity;
import com.jx.utility.common_utility.util.Common;

/**
 * 
 * @ClassName: TMenu 
 * @Description: TODO(菜单对象) 
 * @author 姜旭(JasonJiang)
 * @date 2015年6月26日 上午10:44:04 
 *
 */
public class TMenu extends BaseEntity{
	
	private static final long serialVersionUID = 2571507163921264835L;
	/* 菜单编码  */
	private String code;
	/* 菜单名称  */
	private String name;
	/* 父级菜单  */
	private String parentCode;
	/* 菜单级别  */
	private Integer level;
	/* 菜单URL  */
	private String url;
	/* 菜单图标  */
	private String icon;
	/* 排序  */
	private Integer sort;
	/* 菜单拼音  */
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
