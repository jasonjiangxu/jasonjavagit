package com.jx.sales.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.jx.sales.model.TCust;


@Repository
public interface CustMapper {
	
	public int insertCust(TCust cust);
	
	public int updateCust(TCust cust);
	
	public List<TCust> findCustsByPage(@Param(value="page") Integer page, @Param(value="rows") Integer rows, @Param(value="condis") String[] condis,@Param(value="tm") TCust tc);
}
