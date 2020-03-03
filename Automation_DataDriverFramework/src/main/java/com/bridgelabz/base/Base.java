package com.bridgelabz.base;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.bridgelabz.utility.Utility;

// Base class used to initiate driver instance 
public class Base {
	public WebDriver driver;

	@BeforeMethod
	public void initiateDriverInstance() throws IOException {
		// we are going to make flexible driver
		if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
			driver = new ChromeDriver();	
		}
		else if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("firefox"))
		{
			 System.setProperty("webdriver.gecko.driver","./driver/geckodriver");
			  driver = new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
			driver = new ChromeDriver();			
		}	
		
		driver.get(Utility.fetchPropertyValue("applicationURL").toString());	// fetch the value from Properties file 
		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeDriverInstance() {
		driver.close();
	}
}
