package com.centaline.core.web;

import java.util.List;

/**
 * 
 * @ClassName: PageUtil 
 * @Description: TODO(分页工具类) 
 * @author 姜旭(JasonJiang)
 * @date 2015年8月15日 下午3:58:35 
 * 
 * @param <E>
 */
public class PageUtil<E> {
	
	private static final int NUM_DEFAULT_PAGE = 20;  //默认每页大小
	private List<E> rows;//分页结果
	private int start; //分页开始记录行
	private int end;   //分页结束记录行
	private int limit; //每页多少
	private int page;//当前起始页
	private int total;		//总记录数
	private int pages; //总页数
	
	public int getPages() {
		pages=getTotal()%getLimit() == 0 ? getTotal()/getLimit() : getTotal()/getLimit()+1;
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getEnd() {
		end=getPage() <= 1 ? getLimit() : getPage() * getLimit();
		end=end<=total?end:total;
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getPage() {
		return page <= 0 ? 1 : page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getLimit() {
		return limit <= 0 ? NUM_DEFAULT_PAGE : limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public List<E> getRows() {
		return rows;
	}

	public void setRows(List<E> rows) {
		this.rows = rows;
	}

	public int getStart() {
		start=getPage() <= 1 ? 0 : (getPage() - 1) * getLimit();
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
