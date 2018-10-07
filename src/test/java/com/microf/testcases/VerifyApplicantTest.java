package com.microf.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.microf.qa.base.TestBase;
import com.microf.qa.pages.DashBoard;
import com.microf.qa.pages.LoginPage;
import com.microf.qa.pages.VerifyApplicant;
import com.microf.qa.util.TestUtil;

public class VerifyApplicantTest extends TestBase{
	
	LoginPage loginpage;
	DashBoard dashboard;
	VerifyApplicant verifyApplicant;
	
	public  VerifyApplicantTest() {
		super();
	}
	
	@DataProvider
	public Object[][] getTestDataApplicant(){
		Object data[][]=TestUtil.getTestData("LoanDetails");
		return data;
		
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginpage = new LoginPage();
	}
	
	@Test(dataProvider="getTestDataApplicant")
	public void verifyApplicantdetails(String strTotalJobPrice, String strLoanAmountRequested, String strLastName, String strMiddleInit,String strFirstName, String strEmailid  ){
		verifyApplicant.enterLoandetails(strTotalJobPrice, strLoanAmountRequested, strLastName, strMiddleInit,strFirstName ,strEmailid);
	}
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}

}
