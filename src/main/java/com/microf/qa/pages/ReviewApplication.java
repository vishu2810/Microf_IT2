package com.microf.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.microf.qa.base.TestBase;

public class ReviewApplication extends TestBase{
	
	public ReviewApplication() {
		PageFactory.initElements(driver,this);
		
	}
	 @FindBy(id="nextBtn")
	 WebElement nextBtn;


	 public void completeReviewPage() {
		 nextBtn.click();
		 	 
		 WebElement selectProfile=(new WebDriverWait(driver,10)).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("yesAcceptCredit")))); 
		 selectProfile.click();
	 }
}
