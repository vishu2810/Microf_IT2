package com.microf.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.microf.qa.base.TestBase;
import com.microf.qa.pages.DashBoard;
import com.microf.qa.pages.LoginPage;
import com.microf.qa.pages.PersonalInformation;
import com.microf.qa.pages.ReviewApplication;
import com.microf.qa.pages.SelectDisclosures;
import com.microf.qa.pages.SelectProducts;
import com.microf.qa.pages.VerifyApplicant;
import com.microf.qa.util.TestUtil;

public class E2ETest extends TestBase{
	
	LoginPage loginpage;
	DashBoard dashboard;
	SelectProducts selectproducts;
	VerifyApplicant verifyApplicant;
	SelectDisclosures selectdisclosures;
	PersonalInformation personalInformation;
	ReviewApplication reviewApplication;
	
	public E2ETest() {
		super();
	}
	
	@DataProvider
	public Object[][] getTestDataApplicant() {
		
		
			Object data[][];
			data = TestUtil.getTestData("E2E");
			return data;		
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		loginpage = new LoginPage();
		dashboard= loginpage.loginpagefnc(prop.getProperty("username"), prop.getProperty("password"));	
		System.out.println("in before method");
	}
	
	@Test(dataProvider="getTestDataApplicant")
	public void CreateApplication(String strterm1, String strterm2, String strterm3, String strTotalJobPrice, String strLoanAmountRequested, 
			String strLastName, String strMiddleInit, String strFirstName, String strEmailid, String strSSN, String strDateofBirth, 
			String strStreetAddress1, String strCitizenship, String strCity, String strState, String strZip, String strnoYears, String strnoMonths,
			String MobilePhone, String strEmployer, String strOccupation, String strAnnualIncome){
	
		selectproducts =dashboard.startNewApplication();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verifyApplicant = selectproducts.selectproduct(strterm1, strterm2, strterm3);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		selectdisclosures= verifyApplicant.enterLoandetails(strTotalJobPrice, strLoanAmountRequested, strLastName, strMiddleInit,strFirstName ,strEmailid);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		personalInformation = selectdisclosures.selectDisclosures();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		reviewApplication = personalInformation.enterApplicantInfo(strSSN, strDateofBirth, strStreetAddress1, strCitizenship, strCity,
				strState, strZip, strnoYears, strnoMonths, MobilePhone, strEmployer, strOccupation, strAnnualIncome);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		reviewApplication.completeReviewPage();
	}	
	
	
	
	@AfterMethod
	public void teardown(){
		System.out.println("completed");
		//driver.quit();
	}
	
	
}
