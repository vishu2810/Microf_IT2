package com.microf.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.microf.qa.base.TestBase;

public class SelectProducts extends TestBase{
	
	public SelectProducts(){
	
		PageFactory.initElements(driver, this);
	}
	public VerifyApplicant selectproduct(String term1, String term2, String term3){
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//dummy products page that shows the various payment options
		driver.findElement(By.id("nextBtn")).click();
		
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='table-simple table-responsive']"));
		
		/*System.out.println(term1 + term2 + term3);
		term1 = term1.substring(0, term1.length()-2);
		term2 = term2.substring(0, term2.length()-2);
		term3 = term3.substring(0, term3.length()-2);
		System.out.println(term1 + term2 + term3);
		*/
			List<WebElement> table1 = list.get(2).findElements(By.tagName("tr"));
			List<WebElement> table2 = list.get(3).findElements(By.tagName("tr"));
			List<WebElement> table3 = list.get(4).findElements(By.tagName("tr"));
			
			for(int row1 = 1; row1 <table1.size()-1; row1 ++) {
				List<WebElement> columns1 = table1.get(row1).findElements(By.tagName("td"));
				//for(int col = 1; col<4; col ++) {
				//checking for the loan tenure so neglecting the column loop
					String cellText1 = columns1.get(1).getText();
					if (cellText1.equals(term1)){
						columns1.get(0).click();
					}
				//}
			}

			for(int row2 = 1; row2 <table2.size()-1; row2 ++) {
				List<WebElement> columns2 = table2.get(row2).findElements(By.tagName("td"));
				//for(int col = 1; col<4; col ++) {
				//checking for the loan tenure so neglecting the column loop
					String cellText2 = columns2.get(1).getText();
					if (cellText2.equals(term2)){
						columns2.get(0).click();
					}
				//}
			}

					for(int row3 = 1; row3 <table3.size()-1; row3 ++) {
						List<WebElement> columns3 = table3.get(row3).findElements(By.tagName("td"));
						//for(int col = 1; col<4; col ++) {
						//checking for the loan tenure so neglecting the column loop
							String cellText3 = columns3.get(1).getText();
							if (cellText3.equals(term3)){
								columns3.get(0).click();
							}
					}
						//}
					
		
		
		
		/*
		
		//real product selection page
		for (int i=1;i<=5;i++)
		{
			WebElement e1 = driver.findElement(By.xpath("//*[@id='divMainSection']/div[2]/div/div[1]/div/div[2]/form/div/div[4]/div[2]/div[1]/div/div/div/table/tbody[1]/tr["+i+"]/td[2]/div"));
			if (e1.getText().equals(term1))
			{
	
				driver.findElement(By.xpath("//*[@id='divMainSection']/div[2]/div/div[1]/div/div[2]/form/div/div[4]/div[2]/div[1]/div/div/div/table/tbody[1]/tr["+i+"]/td[1]/div")).click();
				break;
			}
		}
		
		for (int i=1;i<=3;i++)
		{
			WebElement e2 = driver.findElement(By.xpath("//*[@id='divMainSection']/div[2]/div/div[1]/div/div[2]/form/div/div[4]/div[2]/div[2]/div/div/div/table/tbody[1]/tr["+i+"]/td[2]/div"));
			if (e2.getText().equals(term2))
			{
		
				driver.findElement(By.xpath("//*[@id='divMainSection']/div[2]/div/div[1]/div/div[2]/form/div/div[4]/div[2]/div[2]/div/div/div/table/tbody[1]/tr["+i+"]/td[1]/div")).click();
				break;
			}
		}
		for ( int i=1;i<=2;i++)
		{
			WebElement e3 = driver.findElement(By.xpath("//*[@id='divMainSection']/div[2]/div/div[1]/div/div[2]/form/div/div[4]/div[2]/div[3]/div/div/div/table/tbody[1]/tr["+i+"]/td[2]/div"));
			if (e3.getText().equals(term3))
			{
			
				driver.findElement(By.xpath("//*[@id='divMainSection']/div[2]/div/div[1]/div/div[2]/form/div/div[4]/div[2]/div[3]/div/div/div/table/tbody[1]/tr["+i+"]/td[1]/div")).click();
				break;
			}
		}
*/			
	
		driver.findElement(By.id("nextBtn")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new VerifyApplicant();
	}
}



