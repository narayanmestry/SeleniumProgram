package com.bridgelabz.extendsreport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportDemo {

	static WebDriver driver = null;
	public static void main(String[] args) {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent_report.html");
	
		ExtentReports extent = new ExtentReports(); 
		extent.attachReporter(htmlReporter);
		
		ExtentTest test1 = extent.createTest("Google search Test ","This is test to ckeck the google Functionlity") ;
 		
		String projectPath = System.getProperty("user.dir");
	
		System.setProperty("webdriver.chrome.driver","/home/admin1/eclipse-workspace/SeleniumTutorial/TestNGApp/driver/chromedriver/chromedriver");
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Start the test");
		
		driver.get("https://www.google.com/");
		test1.pass("Navigate to google");
		driver.findElement(By.name("q")).sendKeys("Facebook");
		test1.pass("Enter the text in Search box");

		driver.findElement(By.name("btnK")).click();
		test1.pass("Click the Button");
		
		driver.close();
		driver.quit();
		test1.pass("Close the Browser");
		
	
		test1.pass("Test Compleated");

        extent.flush();
	}

}
 