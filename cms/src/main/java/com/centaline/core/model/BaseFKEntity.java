package com.centaline.core.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

/**
 * 基础对象 抽象公共的属性
 * @author jiangxu2
 *
 */
@MappedSuperclass
public abstract class BaseFKEntity implements Serializable {
	
	private static final long serialVersionUID = -4606172629875853524L;
	
	/* 主键 */
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(name="FK_ID",length=64,nullable=false,unique=true)
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
