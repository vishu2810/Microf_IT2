package com.microf.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.microf.qa.base.TestBase;
import com.microf.qa.pages.DashBoard;
import com.microf.qa.pages.LoginPage;
import com.microf.qa.pages.SelectProducts;
import com.microf.qa.util.TestUtil;

public class DashBoardTest extends TestBase{
	
	LoginPage loginpage;
	DashBoard dashboard;
	SelectProducts selectproducts;
	public DashBoardTest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		loginpage = new LoginPage();
		dashboard= loginpage.LoginPage(prop.getProperty("username"), prop.getProperty("password"));	
	}
	
	@Test(priority =1)
	public void verifyDashBoardPageTitle(){
		String pageTitle = dashboard.verifyDashBoardPagetitle();
		Assert.assertEquals(pageTitle, "Dealer Portal", " Dashboard Page Title not matching");		
	}
	
	@Test(priority=2)
	public void startApplicationTest(){
		selectproducts = dashboard.startNewApplication();
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	

}
