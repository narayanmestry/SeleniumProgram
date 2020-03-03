package com.bridgelabz.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.bridgelabz.page.FacebookPage;

public class FacebookTest {
	static WebDriver driver;
	static FacebookPage fb = null;
	static String nexturl;
	static ExtentReports extent ;

	@BeforeMethod
	public void setUp() {
//		System.setProperty("webdriver.chrome.driver",
//				"/home/admin1/eclipse-workspace/SeleniumTutorial/TestNGApp/driver/chromedriver/chromedriver");
//
//		driver = new ChromeDriver();
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver",projectPath+"/driver/geckodriver/geckodriver");
		driver = new FirefoxDriver();
//
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("facebook_extent_report.html");
		extent = new ExtentReports(); 
		extent.attachReporter(htmlReporter);
		ExtentTest test1 = extent.createTest("Facebook Login Test ","This is Test for to ckeck Login Functionality");
			
		 
		test1.log(Status.INFO, "Start the test");
		driver.get("https://www.facebook.com/");
		test1.pass("Navigate to google");
 
		driver.manage().window().maximize();
		test1.pass("Maximize the Windows");

//		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(groups = {"facebook"})
	public void facebookLogin() throws InterruptedException {
		fb = new FacebookPage(driver);
		fb.setEmail("mestryn9727@gmail.com");
		fb.setPassword("chetan@123");
		fb.clickLogin();
		nexturl = driver.getCurrentUrl();
	}

	@Test(groups = {"facebook"})
	public void updateProfilePhoto() throws InterruptedException {
		driver.get(nexturl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fb.clickProfileIcon();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
//		driver.quit();
//        extent.flush();
	}

}
