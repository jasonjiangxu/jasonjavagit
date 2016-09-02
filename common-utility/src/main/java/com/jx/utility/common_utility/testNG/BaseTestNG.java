package com.jx.utility.common_utility.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public abstract class BaseTestNG {
	 @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("@BeforeSuite");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("@BeforeTest");
	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("@BeforeClass");
	  }
	  
	  @AfterClass
	  public void afterClass() {
		  System.out.println("@AfterClass");
	  }
	  @AfterTest
	  public void afterTest() {
		  System.out.println("@AfterTest");
	  }
	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("@AfterSuite");
	  }
	  @BeforeMethod
	  public void BeforeMethod() {
		  System.out.println("@BeforeMethod");
	  }
	  @AfterMethod
	  public void AfterMethod() {
		  System.out.println("@AfterMethod");
	  }
}
