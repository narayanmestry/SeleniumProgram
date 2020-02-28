package com.bridgelab.activeElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiveElementDemo {
	static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"/home/adminstrator/eclipse-workspace/SeleniumTutorial/selenuimAppTest/driver/geckodriver/geckodriver");
		// launch the fireFoxDriver
		driver = new FirefoxDriver();

//		driver.get("http://localhost:8080/login.do");
		driver.get("http://facebook.com");
		
		// Enter the data in Active Element 
		driver.switchTo().activeElement().sendKeys("chetanmestry");
					
		
		Thread.sleep(2000);

		// Clean the Data in Active Element 
		driver.findElement(By.id("email")).clear();	

		Thread.sleep(4000);
		driver.findElement(By.id("email")).sendKeys("NarayanMesrty");
		
//		driver.close();
		
	}
}
