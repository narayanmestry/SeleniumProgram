package com.bridgelab.handling_popup;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles_demo2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		int count = windowHandles.size();
		System.out.println("Size of all Window :"+count);
		
		for(String windowHandle:windowHandles)
		{
			// First Switch the window by Id 
			driver.switchTo().window(windowHandle);
			
			System.out.println("Id :"+windowHandle+"\nTitle :"+driver.getTitle());
			Thread.sleep(1000);
			driver.close();
		}
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
