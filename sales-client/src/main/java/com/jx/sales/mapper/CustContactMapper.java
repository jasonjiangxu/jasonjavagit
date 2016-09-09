package com.jx.sales.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.jx.sales.model.TCustContact;

@Repository
public interface CustContactMapper {
	
	public int insertContact(TCustContact custContack);
	
	public List<TCustContact> findCustContactByPage(@Param(value="page") Integer page, @Param(value="rows") Integer rows, @Param(value="condis") String[] condis,@Param(value="tm") TCustContact tm);
}
