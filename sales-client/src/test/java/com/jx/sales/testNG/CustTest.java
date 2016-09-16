package com.jx.sales.testNG;

import java.util.Date;

import org.testng.annotations.Test;

import com.jx.sales.model.TCust;
import com.jx.sales.service.ICustService;
import com.jx.utility.common_utility.testNG.BaseTestNG;
import com.jx.utility.web.PageUtil;

public class CustTest extends BaseTestNG{
	
  @Test
  public void testSaveCust() {
	  ICustService custserv=(ICustService) getCtx().getBean("custService");
	  TCust cust=new TCust();
	  cust.setId("ceshi001");
	  cust.setCode("0001");
	  cust.setVip('Y');
	  cust.setCreateUser("admin");
	  cust.setCreateTime(new Date());
	  try {
		int row=custserv.saveCust(cust);
		if(row>0){
			 System.out.println("测试成功");
		}
	} catch (Exception e) {
		System.out.println("发生异常："+e.getMessage());
	}
  }
  
  @Test
  public void testFindCust() {
	  ICustService custserv=(ICustService) getCtx().getBean("custService");
	  PageUtil<TCust> pag= custserv.findCustByPage(1, 30, null, null);
	  System.out.println("总记录数："+pag.getTotal());
	  for(TCust cust:pag.getRows()){
		  System.out.println("custcode:"+cust.getCode());
	  }
  }
}
