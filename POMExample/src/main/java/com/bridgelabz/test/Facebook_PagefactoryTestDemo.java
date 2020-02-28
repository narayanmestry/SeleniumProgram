package com.bridgelabz.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bridgelabz.pageobject.FacebookLogin;
import com.bridgelabz.pageobject.FacebookWithPageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_PagefactoryTestDemo {
	static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		facebookLogin(driver);
		
		Thread.sleep(1000);
		driver.close();
	}
	private static void facebookLogin(WebDriver driver) throws InterruptedException {
		FacebookWithPageFactory fblogin = new FacebookWithPageFactory(driver);
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		fblogin.setEmail();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		fblogin.setPassword();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		fblogin.clickSubmit();
	}
}
