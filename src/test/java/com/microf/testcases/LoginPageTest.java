package com.microf.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.microf.qa.base.TestBase;
import com.microf.qa.pages.DashBoard;
import com.microf.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	DashBoard dashboard;
	
	public  LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginpage = new LoginPage();
	}
	
	@Test(priority=2)
	public void LoginPagetitletest(){
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title,"Dealer Portal");		
	}
	
	@Test(priority=1)
	public void ValidateLoginPage(){
		Boolean loginpageexists = loginpage.validateLoginPage();
		Assert.assertTrue(loginpageexists);
	}
	
	@Test(priority=3)
	public void LoginPage(){
		dashboard = loginpage.loginpagefnc(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
}
