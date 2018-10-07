package com.microf.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.microf.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory
	@FindBy(id = "email")
	WebElement email; 
	
	@FindBy(id = "password")
	WebElement pswd;
	
	@FindBy(id = "sign-in")
	WebElement btnsign;
	
	@FindBy(xpath="//div[@class='login-panel']")
	WebElement verifyloginsection;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);//this will initialize all the objects of the current class
		}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateLoginPage(){
		return verifyloginsection.isDisplayed();
	}
	
	public DashBoard LoginPage(String username, String password){
		email.sendKeys(username);
		pswd.sendKeys(password);
		btnsign.click();
		
		return new DashBoard();
	}
	

}
