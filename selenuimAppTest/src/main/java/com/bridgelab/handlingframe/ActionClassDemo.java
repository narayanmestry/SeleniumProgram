package com.bridgelab.handlingframe;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"/home/adminstrator/eclipse-workspace/SeleniumTutorial/selenuimAppTest/driver/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.javatpoint.com/");
		
		Actions action = new Actions(driver);
		
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Home')]"))).perform(); 
		Thread.sleep(500);
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Home')]"))).perform(); 
		Thread.sleep(500);
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Python')]"))).perform(); 
		Thread.sleep(500);
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Java')]"))).perform(); 
		Thread.sleep(500);
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'PHP')]"))).perform(); 
		Thread.sleep(500);
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'JavaScript')]"))).perform(); 
		Thread.sleep(500);
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'C++')]"))).perform(); 
		Thread.sleep(500);
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'C#')]"))).perform(); 
		Thread.sleep(500);
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Aptitude')]"))).perform(); 
		Thread.sleep(500);
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Reasoning')]"))).perform(); 
		Thread.sleep(500);
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Programs')]"))).perform(); 
		Thread.sleep(500);
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Selenium')]"))).perform(); 
		Thread.sleep(500);
		
		// Drag and Drop 
		
		
		Thread.sleep(6000);
		driver.close();
	}
}
/*
 * Action Class Operation 
 * 	1. double click
 * 	2. MOUSEOVER
 */