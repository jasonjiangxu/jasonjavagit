package com.jx.manager.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IDictWebservice {
	@WebMethod
	public String test(String username);
	@WebMethod
	public String findDictByCodeAndType(String code, String type);
}
