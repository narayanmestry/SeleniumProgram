package com.bridgelabz.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bridgelabz.page.GooglePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_basic {
	WebDriver driver = null;

	// preCondition
	@BeforeSuite
	public void setUp() {
		System.out.println("Setup System Propety for Chrome");
	}

	@BeforeTest
	public void login() {
		System.out.println("Login Method");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("launch Chrome Browser");
	}

	@BeforeMethod
	public void enterUrl() {
		System.out.println("Enter the Url ");
	}

	// test case

	@Test(groups = { "title" })
	public void googleTitleTest() {
		System.out.println("1. Google Title");
	}

	@Test(groups = { "search" })
	public void googleSearch() {
		System.out.println("2. Google Search");
	}

	@Test(groups = { "title", "search" })
	public void fblogin() {
		System.out.println("3. fb login");
	}

	// post condition
	@AfterMethod
	public void logout() {
		System.out.println("Logout");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("Close browser");
	}

	@AfterTest
	public void deleteAll() {
		System.out.println("Delete all cookie");
	}

	@AfterSuite
	public void generateReport() {
//		System.out.println("Generate Report");
	}

//	
//	@BeforeTest
//	public void setUp() {
//		WebDriverManager.firefoxdriver().setup();
//		driver = new FirefoxDriver();
//	}
//
//	@Test(priority = 0)
//	public void googleSearch() {
//		GooglePage gp = new GooglePage(driver);
//		driver.get("https://www.google.com/");
//		gp.setText("Facebook");
//		gp.clickButton();
//	}
//
//	
//
//	@AfterTest
//	public void tearDownTest() {
//		driver.close();
//		System.out.println("test successfully Complete done");
//	}

}
