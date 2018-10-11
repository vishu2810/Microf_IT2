package com.microf.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.microf.qa.base.TestBase;

public class SelectDisclosures extends TestBase{
	
	public SelectDisclosures() {
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(id="aggreStatementOfUse")
	WebElement agreediclosures;
	
	@FindBy(id="applicantCode")
	WebElement applicantCode;
	
	@FindBy(id="nextBtn")
	WebElement nextBtn;
	
	public PersonalInformation selectDisclosures() {
		
		agreediclosures.click();
		applicantCode.sendKeys("9983");
		nextBtn.click();	
		return new PersonalInformation();
	}
	

}
