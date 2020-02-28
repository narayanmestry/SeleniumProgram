package com.bridgelabz.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
	public static void main(String[] args) {
		
	googleSearch();
	System.out.println("Button get Pressed ");
	
	}
	
	
	public static void googleSearch() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
		// navigate to any website
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Facebook");
		driver.findElement(By.name("btnK")).click();
		System.out.println("Pressing .....");
		
	
		//navigation come back  
		driver.navigate().back();
		System.out.println("Comming back....<<");
		
		// navigate to any page forword 
		driver.navigate().forward();
		System.out.println("agin Forword....>>");
		
		// for refresh 
		driver.navigate().refresh();
		System.out.println("refreshing ...");
		
	}
}	
