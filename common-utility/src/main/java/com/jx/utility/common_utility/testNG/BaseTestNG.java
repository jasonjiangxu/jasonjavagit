package com.jx.utility.common_utility.testNG;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public abstract class BaseTestNG {
	
	private ApplicationContext ctx;
	
	 @BeforeSuite
	  public void beforeSuite() {
		 String[] xmlCfg = new String[] { "classpath:applicationContext.xml","classpath:spring-redis.xml"};
		 ctx = new ClassPathXmlApplicationContext(xmlCfg);
	  }
	  @BeforeTest
	  public void beforeTest() {
	  }
	  @BeforeClass
	  public void beforeClass() {
	  }
	  
	  @AfterClass
	  public void afterClass() {
	  }
	  @AfterTest
	  public void afterTest() {
	  }
	  @AfterSuite
	  public void afterSuite() {
	  }
	  @BeforeMethod
	  public void BeforeMethod() {
	  }
	  @AfterMethod
	  public void AfterMethod() {
	  }
	public ApplicationContext getCtx() {
		return ctx;
	}
	public void setCtx(ApplicationContext ctx) {
		this.ctx = ctx;
	}
}
