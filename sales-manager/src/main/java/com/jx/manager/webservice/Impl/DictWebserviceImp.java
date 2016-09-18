package com.jx.manager.webservice.Impl;

import javax.jws.WebService;

import com.jx.manager.webservice.IDictWebservice;

@WebService(endpointInterface="com.jx.manager.webservice.IDictWebservice")
public class DictWebserviceImp implements IDictWebservice {

	@Override
	public String test(String str) {
		return str;
	}

}
