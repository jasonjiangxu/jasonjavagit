package com.jx.manager.service;

import java.util.List;

import com.jx.manager.model.TDict;

public interface IDictService {
	/**
	 * 保存客户信息
	 * @param cust
	 * @return
	 * @throws Exception
	 * @author 姜旭
	 * @datetime 2016-09-15 22:11
	 */
	public int saveDict(TDict dict) throws Exception;
	
	public int modifyDict(TDict dict) throws Exception;
	
	public List<TDict> findDictByCodeAndType(String code,String type);
	
	public List<TDict> findDictByType(String type);
	
	public List<TDict> findDictLikeNameOrPy(String nameOrPy);
}
