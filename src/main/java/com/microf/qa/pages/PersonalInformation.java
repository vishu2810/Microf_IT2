package com.microf.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.microf.qa.base.TestBase;

public class PersonalInformation extends TestBase{
	
 public  PersonalInformation() {
	 PageFactory.initElements(driver, this);
 }
 
 @FindBy(id="ssn")
 WebElement SSN;

 @FindBy(id="propertyStreetAddr")
 WebElement propertyStreetAddr ;
 
 @FindBy(id="propertyCity")
 WebElement propertyCity;
 
 @FindBy(id="propertyZip")
 WebElement propertyZip;
 
 @FindBy(id="employer")
 WebElement employer;
 
 @FindBy(id="grossYearlyIncome")
 WebElement grossYearlyIncome;
 
 @FindBy(id="numberOfYearsAtAddress")
 WebElement numberOfYearsAtAddress;
 
 @FindBy(id="numberOfMonthsAtAddress")
 WebElement numberOfMonthsAtAddress;
 
 @FindBy(id="contactMobilePhone")
 WebElement contactMobilePhone;
 
 @FindBy(id="contactHomePhone")
 WebElement contactHomePhone;
 
 @FindBy(id="nextBtn")
 WebElement nextBtn;

 Select selCitizenship = new Select(driver.findElement(By.id("citizenship")));
 Select selState = new Select(driver.findElement(By.id("propertyState")));
 Select selOccupation = new Select(driver.findElement(By.id("occupation")));
 
 @FindBy(id="dob")
 WebElement dob;
 
 @FindBy(id= "bypassAddressValidation")
 WebElement addressbypass;
 
 public ReviewApplication enterApplicantInfo(String strSSN, String strDateofBirth, String strStreetAddress1, String strCitizenship, 
		 String strCity, String strState, String strZip, String strnoYears, String strnoMonths,	String MobilePhone, 
		  String strEmployer, String strOccupation, String strAnnualIncome) {
	 
	 SSN.sendKeys(strSSN);
	 propertyStreetAddr.sendKeys(strStreetAddress1);
	 propertyCity.sendKeys(strCity);
	 selState.selectByVisibleText(strState);
	 propertyZip.sendKeys(strZip);
	 numberOfMonthsAtAddress.sendKeys(strnoMonths);
	 numberOfYearsAtAddress.sendKeys(strnoYears);
	 contactMobilePhone.sendKeys(MobilePhone);
	// contactHomePhone.sendKeys(strWorkPhone);
	 employer.sendKeys(strEmployer);
	 grossYearlyIncome.sendKeys(strAnnualIncome);
	 selCitizenship.selectByVisibleText(strCitizenship);
	 selOccupation.selectByVisibleText(strOccupation);
	 PersonalInformation.setDateUsingJS(driver, strDateofBirth, dob);
	 nextBtn.click();
	 
	 try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 if (addressbypass.isEnabled()) {
		 addressbypass.click();
		 nextBtn.click();
	 }
	 
	 return new ReviewApplication();
	 
	 
 }
 
 
 public static void setDateUsingJS(WebDriver driver, String value, WebElement calLocator) {
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 String script = "arguments[0].setAttribute('value','"+value+"');";
	 js.executeScript(script, calLocator);
 }
 
	
}
