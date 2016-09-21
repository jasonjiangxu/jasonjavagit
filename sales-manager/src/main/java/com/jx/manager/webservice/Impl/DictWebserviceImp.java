package com.jx.manager.webservice.Impl;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.jx.manager.model.TDict;
import com.jx.manager.service.IDictService;
import com.jx.manager.webservice.IDictWebservice;

import net.sf.json.JSONArray;

@WebService(endpointInterface="com.jx.manager.webservice.IDictWebservice")
public class DictWebserviceImp implements IDictWebservice {
	
	@Autowired
	private IDictService dictService;
	
	@Override
	public String test(String str) {
		return str;
	}

	@Override
	public String findDictByCodeAndType(String code, String type) {
		 List<TDict> ditclist=dictService.findDictByCodeAndType(code, type);
		 JSONArray jarray=JSONArray.fromObject(ditclist);
		return jarray.toString();
	}

}
