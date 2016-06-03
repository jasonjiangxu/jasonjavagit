package com.centaline.sysmgr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.centaline.core.model.BaseEntity;

/**
 * 
 * @ClassName: TConfig 
 * @Description: TODO(系统配置) 
 * @author 姜旭(JasonJiang)
 * @date 2015年7月29日 上午8:27:10 
 *
 */
@Entity
@Table(name="T_CONFIG")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class TConfig extends BaseEntity{
	
	private static final long serialVersionUID = -1521118568119913405L;
	
	/* logo图片  */
	@Column(name="C_LOGO_IMG",length=125)
	private String logoImg;
	/* logo文字 */
	@Column(name="C_LOGO_TXT",length=125)
	private String logoText;
	/* 使用标志 使用图片还是文字 0 图片 1 文字  */
	@Column(name="C_USE",length=1)
	private char useLogo;
	/* logo地址 */
	@Column(name="C_LOGO_URL",length=64)
	private String logourl;
	/* 主标题  */
	@Column(name="C_MAIN_TITLE",length=64)
	private String maintitle;
	/* 副标题  */
	@Column(name="C_SUB_TITLE",length=64)
	private String subtitle;
	/* 当前位置  */
	@Column(name="C_POSITION",length=64)
	private String position;
	/* 当前位置链接 */
	@Column(name="C_POSITION_URL",length=64)
	private String posiurl;
	
	public String getLogourl() {
		return logourl;
	}
	public void setLogourl(String logourl) {
		this.logourl = logourl;
	}
	public String getLogoImg() {
		return logoImg;
	}
	public void setLogoImg(String logoImg) {
		this.logoImg = logoImg;
	}
	public String getLogoText() {
		return logoText;
	}
	public void setLogoText(String logoText) {
		this.logoText = logoText;
	}
	
	public char getUseLogo() {
		return useLogo;
	}
	public void setUseLogo(char useLogo) {
		this.useLogo = useLogo;
	}
	public String getMaintitle() {
		return maintitle;
	}
	public void setMaintitle(String maintitle) {
		this.maintitle = maintitle;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getPosiurl() {
		return posiurl;
	}
	public void setPosiurl(String posiurl) {
		this.posiurl = posiurl;
	}
}
