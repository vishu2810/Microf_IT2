package com.microf.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.microf.qa.base.TestBase;

public class SelectProducts extends TestBase{
	
	public void selectproduct(){
		String term1 = "48";
		String term2 = "67";
		String term3 = "77";
		

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
			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("nextBtn")).click();
	}
}


