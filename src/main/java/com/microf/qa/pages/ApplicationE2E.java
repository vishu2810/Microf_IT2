package com.microf.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.microf.qa.base.TestBase;

public class ApplicationE2E extends TestBase{
	
	public ApplicationE2E(){
		PageFactory.initElements(driver, this);
	}
	
	
}
