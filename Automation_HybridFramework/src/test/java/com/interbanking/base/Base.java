package com.interbanking.base;

import java.io.IOException;

//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.interbanking.utility.ReadConfig;



public class Base {
	
	ReadConfig readConfig = new ReadConfig();
	
	public String applicationURL = readConfig.getApplicationURL();
	public String username =readConfig.userName();
	public String password = readConfig.password();
	
	public static WebDriver driver;
//	public static Logger logger ;
	
	
	@BeforeMethod
	public void initiateDriverInstance() throws IOException {
//		logger = Logger.getLogger("Banking");
//		PropertyConfigurator.configure("log4j.properties");
		
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/driver/chromedriver");
			// launch the fireFoxDriver
			driver = new ChromeDriver();
		
		
	}


	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
