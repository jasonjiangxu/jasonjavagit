package com.centaline.custormer.mapper.xml;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.centaline.custormer.model.TCustHolder;

@Repository
public interface CustHolderMapper {
	
	public int insertCustHolder(TCustHolder holder);
	
	public List<TCustHolder> findCustHolderByPage(@Param(value="page") Integer page, @Param(value="rows") Integer rows, @Param(value="condis") String[] condis,@Param(value="tm") TCustHolder tm);
}
