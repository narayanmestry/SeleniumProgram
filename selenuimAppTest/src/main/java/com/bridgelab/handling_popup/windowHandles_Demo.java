package com.bridgelab.handling_popup;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowHandles_Demo {
	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver","/home/admin1/Downloads/SeleniumTutorial-master/selenuimAppTest/driver/geckodriver/geckodriver");
		 WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.myntra.com/men-formal-shoes");
		String parentTitle = driver.getTitle();
		System.out.println("Parent Title : "+parentTitle);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@title='Red Tape Men Black Men Leather Formal Oxfords']")).click();
		
		
		// Fofr Single Window :
		String singleWindow = driver.getWindowHandle();
		System.out.println("Id Of Single Window :"+singleWindow);
		
		
		// for multiple Windows:
		Set<String> windowHandles = driver.getWindowHandles() ;
		System.out.println(windowHandles);
		
		Iterator<String> it = windowHandles.iterator();
		String parentWindowId = it.next();		// Parent window Id
		System.out.println("parentWindowId :"+parentWindowId);
		String childWindowId = it.next();		// Parent window Id
		System.out.println("childWindowId :"+childWindowId);
		
		// Now we are going to Handle the Window from Parent to CHild By Window Id
		driver.switchTo().window(childWindowId);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String childTitle = driver.getTitle();
		System.out.println("Child Title : "+childTitle);
	
		
	}
}
