package com.jx.sales.service;

import com.jx.sales.model.TCust;
import com.jx.utility.web.PageUtil;

public interface ICustService {
	/**
	 * 保存客户信息
	 * @param cust
	 * @return
	 * @throws Exception
	 * @author 姜旭
	 * @datetime 2016-09-15 22:11
	 */
	public int saveCust(TCust cust) throws Exception;
	
	/**
	 * 分页查询客户信息
	 * @param cust
	 * @return
	 * @author 姜旭
	 * @datetime 2016-09-15 22:11
	 */
	public PageUtil<TCust> findCustByPage(Integer page, Integer rows, String[] condis, TCust cust);
}
