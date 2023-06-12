package com.crm.qa.testcases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hirestreet.qa.base.TestBase;
import com.hirestreet.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage loginpage;

	public LoginPageTest()
	{
		super();	
	}

	//	@BeforeClass
	//	public void setUp()
	//	{
	//		initialization();
	//	
	//		 loginpage=new LoginPage();
	//		 
	//	}

	@Test
	public void profileIconTest() throws InterruptedException
	{
		//	loginpage.ToU();
		
		initialization();

		loginpage=new LoginPage();	
		Thread.sleep(3000);
		loginpage.popUp();
	}

	//	@AfterClass
	//	public void teardown()
	//	{
	//		driver.quit();
	//	}

}




