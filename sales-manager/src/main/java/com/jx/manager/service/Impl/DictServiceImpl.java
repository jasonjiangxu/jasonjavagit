package com.jx.manager.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jx.manager.mapper.DictMapper;
import com.jx.manager.model.TDict;
import com.jx.manager.service.IDictService;

@Service("dictService") 
public class DictServiceImpl implements IDictService {

	@Autowired
	private DictMapper dictMapper;
	
	@Override
	public int saveDict(TDict dict) throws Exception {
		return dictMapper.insertDict(dict);
	}

	@Override
	public int modifyDict(TDict dict) throws Exception {
		return dictMapper.updateDict(dict);
	}

	@Override
	public List<TDict> findDictByCodeAndType(String code, String type) {
		return dictMapper.findDictByCodeAndType(code, type);
	}

	@Override
	public List<TDict> findDictByType(String type) {
		return dictMapper.findDictByType(type);
	}

	@Override
	public List<TDict> findDictLikeNameOrPy(String nameOrPy) {
		return dictMapper.findDictLikeNameOrPy(nameOrPy);
	}

}
