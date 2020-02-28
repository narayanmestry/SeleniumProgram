package com.bridgelabz.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bridgelabz.pageobject.IRCTCPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.TesseractException;

public class IRCTCTestDemo {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException, TesseractException {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		// create object of IRCTCPage 
		IRCTCPage irctc = new IRCTCPage(driver);
		
		//load the page 
		driver.get("https://www.irctc.co.in/nget/train-search");
		waitForLoadElement(5);

		// click on login demo
		irctc.clickDropdown();
		waitForLoadElement(5);
		
		irctc.clickLoginButton();
		waitForLoadElement(5);
		
		irctc.SetUserId("mestryn9727");
		waitForLoadElement(5);
		
		irctc.setPassword("Chetan1234");
		waitForLoadElement(5);
		
			
//		irctc.CapchaProcess("Varanasi");
		
		irctc.clickSignIn();
		waitForLoadElement(5);
		
//		driver.close();
	}

	public static void waitForLoadElement(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
}
