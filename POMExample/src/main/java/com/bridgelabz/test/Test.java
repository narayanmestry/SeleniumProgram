package com.bridgelabz.test;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bridgelabz.pageobject.GooglePage;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	static WebDriver driver = null;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		googleSearch(driver);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Url : "+currentUrl);
		
		
		
	}
	
	public static void googleSearch(WebDriver driver)
	{
		driver.get("https://google.com");
		GooglePage.textbox_search(driver).sendKeys("facebook");
//		GooglePage.search_Button(driver).click();
		GooglePage.search_Button(driver).sendKeys(Keys.RETURN);
		System.out.println(".......");	   	
	}
	
	
	
}
