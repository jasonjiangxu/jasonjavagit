package com.jx.sales.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jx.sales.mapper.CustMapper;
import com.jx.sales.model.TCust;
import com.jx.sales.service.ICustService;
import com.jx.utility.web.PageUtil;

@Service("custService") 
public class CustServiceImpl implements ICustService {
	
	@Autowired
	private CustMapper custMapper;
	
	@Override
	public int saveCust(TCust cust) throws Exception {
		return custMapper.insertCust(cust);
	}
	@Override
	public PageUtil<TCust> findCustByPage(Integer page, Integer rows, String[] condis, TCust cust) {
		//构造分页对象
		PageUtil<TCust> pageUser=new PageUtil<TCust>();
		pageUser.setPage(page); //设置当前页
		pageUser.setLimit(rows); //设置每页大小
		List<TCust> list=custMapper.findCustsByPage(page, rows, condis, cust);
		pageUser.setRows(list);
		pageUser.setTotal(1000);
		return pageUser;
	}
}
