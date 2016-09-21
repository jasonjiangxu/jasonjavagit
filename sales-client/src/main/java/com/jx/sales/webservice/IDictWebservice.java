package com.jx.sales.webservice;

import javax.jws.WebService;

@WebService(targetNamespace="http://webservice.manager.jx.com/")
public interface IDictWebservice {
	
	public String test(String username);
	
	public String findDictByCodeAndType(String code, String type);
}
