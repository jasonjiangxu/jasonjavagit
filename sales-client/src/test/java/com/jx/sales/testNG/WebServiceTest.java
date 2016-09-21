package com.jx.sales.testNG;

import org.testng.annotations.Test;

import com.jx.sales.webservice.IDictWebservice;
import com.jx.utility.common_utility.testNG.BaseTestNG;

public class WebServiceTest extends BaseTestNG{
	
  @Test
  public void testWebService() {
	  IDictWebservice custserv=(IDictWebservice) getCtx().getBean("dictClient");
	  String a=custserv.test("hello");
	  System.out.println(a);
  }
  
  @Test
  public void testFindDictByCodeAndType() {
	  IDictWebservice custserv=(IDictWebservice) getCtx().getBean("dictClient");
	  String a=custserv.findDictByCodeAndType("10054002","10010");
	  System.out.println(a);
  }
  
}
