package com.microf.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.microf.qa.util.TestUtil;
import com.microf.qa.util.WebEventListener;

public class TestBase {
	
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase(){
		try{
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/microf/qa/config/config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e){
			e.printStackTrace();		
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}	
	
	public static void initialization(){
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishu\\Desktop\\Selenium\\browsing drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} 	
		if (browsername.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\vishu\\Desktop\\Selenium\\browsing drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		e_driver = new EventFiringWebDriver(driver);
		eventListener= new WebEventListener();
		e_driver.register(eventListener);
		driver=e_driver;
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,  TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	
}
