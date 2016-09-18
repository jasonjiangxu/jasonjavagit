package com.jx.manager.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.jx.manager.model.TDict;


@Repository
public interface DictMapper {
	
	public int insertDict(TDict dict);
	
	public int updateDict(TDict dict);
	
	public List<TDict> findDictByCodeAndType(@Param(value="code") String code, @Param(value="type") String type);
	
	public List<TDict> findDictByType(@Param(value="type") String type);
	
	public List<TDict> findDictLikeNameOrPy(@Param(value="nameOrPy") String nameOrPy);
}
