package com.centaline.core.web;

import java.util.List;

public class GridJsonUtil<E> {
	private int total;		//总记录数
	private List<E> rows;//分页结果
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	public List<E> getRows() {
		return rows;
	}
	public void setRows(List<E> rows) {
		this.rows = rows;
	}
	
}
