package com.bridgelab.handling_popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HiddenDivisionPopup_Chrome {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/home/adminstrator/eclipse-workspace/SeleniumTutorial/selenuimAppTest/driver/chromedriver/chromedriver");
	
		ChromeOptions option = new ChromeOptions();
		option.addArguments("-- disable notifications");
		option.addArguments("-- disable geolocation");
		option.addArguments("-- ignore-certifiacte-error");
		
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(3000);
		
//		driver.findElement(By.className("//a[@class='nextMonth']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.className("//a[@class='nextMonth']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.className("//a[@class='nextMonth']")).click();
//		Thread.sleep(3000);
		
		driver.findElement(By.linkText("24")).click();
		
	}
}
