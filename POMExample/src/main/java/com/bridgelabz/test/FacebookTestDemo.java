package com.bridgelabz.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bridgelabz.pageobject.FacebookLogin;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTestDemo {
	static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		facebookLogin(driver);
		
		Thread.sleep(1000);
		driver.close();
	}
	private static void facebookLogin(WebDriver driver) throws InterruptedException {
		FacebookLogin fblogin = new FacebookLogin(driver);
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		fblogin.setEmail("mestryn9727@gmail.com");
		Thread.sleep(1000);
		fblogin.setPassword("chetan@123");
		Thread.sleep(1000);
		fblogin.clickSubmit();
	}
}
