package com.jx.manager.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface IDictWebservice {
	@WebMethod
	public String test(@WebParam(name = "username") String username);
}
