package com.microf.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.microf.qa.base.TestBase;

public class ContactInformation extends TestBase{
	public ContactInformation(){
		PageFactory.initElements(driver, this);
	}

}
