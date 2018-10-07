package com.microf.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.microf.qa.base.TestBase;

public class VerifyApplicant extends TestBase{
	

	@FindBy(id="totalJobPrice")
	WebElement totalJobPrice;
	
	@FindBy(id="LoanAmountRequested")
	WebElement LoanAmountRequested;
	
	@FindBy(id="FirstName")
	WebElement FirstName;
	
	@FindBy(id="LastName")
	WebElement LastName;
	
	@FindBy(id="MiddleInitial")
	WebElement MiddleInitial;
	
	@FindBy(id="EmailId")
	WebElement EmailId;
	
	@FindBy(id="emailConsent")
	WebElement emailConsent;
	
	@FindBy(id="nextBtn")
	WebElement nextBtn;
	
	public void enterLoandetails(String strTotalJobPrice, String strLoanAmountRequested, String strLastName, String strMiddleInit,String strFirstName, String strEmailid ){
		totalJobPrice.sendKeys(strTotalJobPrice);
		LoanAmountRequested.sendKeys(strLoanAmountRequested);
		FirstName.sendKeys(strFirstName);
		LastName.sendKeys(strLastName);
		MiddleInitial.sendKeys(strMiddleInit);
		EmailId.sendKeys(strEmailid);
		emailConsent.click();
		nextBtn.click();		
	}
}
