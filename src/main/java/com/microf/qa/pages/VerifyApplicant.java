package com.microf.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.microf.qa.base.TestBase;

public class VerifyApplicant extends TestBase{
	

	@FindBy(id="totalJobPrice")
	WebElement totalJobPrice;
	
	@FindBy(id="totalFinanceAmt")
	WebElement LoanAmountRequested;
	
	@FindBy(id="applFirstName")
	WebElement FirstName;
	
	@FindBy(id="applLastName")
	WebElement LastName;
	
	@FindBy(id="applMiddleName")
	WebElement MiddleInitial;
	
	@FindBy(id="contactEmail")
	WebElement EmailId;
	
	@FindBy(id="emailConsent")
	WebElement emailConsent;
	
	@FindBy(id="nextBtn")
	WebElement nextBtn;
	
	public VerifyApplicant() {
		PageFactory.initElements(driver, this);
	}
	
	public SelectDisclosures enterLoandetails(String strTotalJobPrice, String strLoanAmountRequested, String strLastName, String strMiddleInit,String strFirstName, String strEmailid ){
		totalJobPrice.sendKeys(strTotalJobPrice);
		LoanAmountRequested.sendKeys(strLoanAmountRequested);
		FirstName.sendKeys(strFirstName);
		LastName.sendKeys(strLastName);
		MiddleInitial.sendKeys(strMiddleInit);
		EmailId.sendKeys(strEmailid);
		emailConsent.click();
		nextBtn.click();		
		return new SelectDisclosures();
	}
}
