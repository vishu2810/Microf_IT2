package com.microf.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.microf.qa.base.TestBase;

public class DashBoard extends TestBase {
	
	
	
	//Page Factory
		@FindBy(xpath = "//li[@id='menuNewApplication']")
		WebElement btnNewApplication;
	
		@FindBy(xpath = "//div[@id='applicantIdentification']")
		WebElement cbIdentifyApplicant;
		
		@FindBy(id="financingAndLeasingBtn")
		WebElement btnFinancingAndLeasing;
		
		public DashBoard(){
			PageFactory.initElements(driver, this);
		}
		
		public String verifyDashBoardPagetitle(){
			return driver.getTitle();
		}
		
		
		public SelectProducts startNewApplication(){
			btnNewApplication.click();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (!(cbIdentifyApplicant).isSelected())	{
				cbIdentifyApplicant.click();
			}
			btnFinancingAndLeasing.click();
						
			return new SelectProducts();
			
			
		}
	

}
