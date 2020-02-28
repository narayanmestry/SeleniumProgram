package com.bridgelabz.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {
	public static WebElement textbox_search(WebDriver driver)
	{
		return driver.findElement(By.name("q"));	
	}
	
	public static WebElement search_Button(WebDriver driver)
	{
		return driver.findElement(By.name("btnK"));
	}
}
