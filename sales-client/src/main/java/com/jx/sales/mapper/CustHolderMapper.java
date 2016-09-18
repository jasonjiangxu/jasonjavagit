package com.jx.sales.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.jx.sales.model.TCustHolder;


@Repository
public interface CustHolderMapper {
	
	public int insertCustHolder(TCustHolder holder);
	
	public List<TCustHolder> findCustHolderByPage(@Param(value="page") Integer page, @Param(value="rows") Integer rows, @Param(value="condis") String[] condis,@Param(value="tm") TCustHolder tm);
}
