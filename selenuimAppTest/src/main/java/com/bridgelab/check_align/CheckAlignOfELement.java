package com.bridgelab.check_align;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckAlignOfELement {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"/home/adminstrator/eclipse-workspace/SeleniumTutorial/selenuimAppTest/driver/geckodriver/geckodriver");
		// launch the fireFoxDriver
		driver = new FirefoxDriver();

//		driver.get("http://localhost:8080/login.do");
		driver.get("http://facebook.com");
		
		WebElement emailText = driver.findElement(By.id("email"));
		int emailYCordinate = emailText.getLocation().getY();
		
		WebElement pwText = driver.findElement(By.id("pass"));
		int passYCordinate = pwText.getLocation().getY();
		System.out.println("Email Y  == "+emailYCordinate);
		System.out.println("Password Y == "+emailYCordinate);
		
		if(emailYCordinate==passYCordinate)
		{
			System.out.println("Element IS Properly Align");
		}
		else
		{
			System.out.println("Not Align Properly");
		}

	}
}
