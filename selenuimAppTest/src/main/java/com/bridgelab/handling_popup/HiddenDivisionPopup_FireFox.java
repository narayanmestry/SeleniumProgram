package com.bridgelab.handling_popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenDivisionPopup_FireFox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/home/adminstrator/eclipse-workspace/SeleniumTutorial/selenuimAppTest/driver/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("24")).click();
		
	}
}
