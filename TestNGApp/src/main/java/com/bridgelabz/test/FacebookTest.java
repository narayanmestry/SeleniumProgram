package com.bridgelabz.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bridgelabz.page.FacebookPage;

public class FacebookTest {
	static WebDriver driver ;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "/home/admin1/eclipse-workspace/SeleniumTutorial/TestNGApp/driver/chromedriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	@Test
	public void facebookLogin() throws InterruptedException
	{
		FacebookPage fb = new FacebookPage(driver);
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		fb.setEmail("mestryn9727@gmail.com");
		fb.setPassword("chetan@123");
		fb.clickLogin();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);	}
	
	@AfterTest
	public void closeBrowser()
	{
//		driver.close();
//		driver.quit();
	}
	
}
