package com.centaline.sysmgr.model;

import java.util.Date;

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
	/* 主键 */
	private String id;
	/* 备注 */
	private String remark;
	/* 创建人编号 */
	private String createUser;
	/* 最近更新人编号 */
	private String updateUser;
	/* 创建时间 */
	private Date createTime;
	/* 最近更新时间 */
	private Date updateTime;
	/* 删除标记 是否删除  Y是 N 否 */
	private char delFlg;
	/* 版本控制 */
	private Integer version;
	
	/* 冗余条件字段 开始时间 不是数据库字段 */
	private String beginDate;
	/* 冗余条件字段 结束时间 不是数据库字段 */
	private String endDate;
	
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
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public char getDelFlg() {
		return delFlg;
	}

	public void setDelFlg(char delFlg) {
		this.delFlg = delFlg;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
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
