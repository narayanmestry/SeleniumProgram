package com.bridgelabz.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bridgelabz.page.GooglePage;


public class GoogleTest {
	WebDriver driver;

	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "/home/admin1/eclipse-workspace/SeleniumTutorial/TestNGApp/driver/chromedriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test(groups = { "google" })
	public void googleTitleTest()
	{
		
		GooglePage gp = new GooglePage(driver);
		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		String title = gp.getTitle();
		System.out.println("Title is : "+title);
		
	}
	
	@Test(groups = { "google" })
	public void googleSearch()
	{
		driver.get("https://www.google.com/");
		GooglePage gp = new GooglePage(driver);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		gp.setText("Facebook");
		gp.clickButton();
	
	}
	

	@AfterMethod
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
}
