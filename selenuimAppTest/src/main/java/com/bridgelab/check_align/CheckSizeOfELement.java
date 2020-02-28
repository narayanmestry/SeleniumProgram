package com.bridgelab.check_align;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckSizeOfELement {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"/home/adminstrator/eclipse-workspace/SeleniumTutorial/selenuimAppTest/driver/geckodriver/geckodriver");
		// launch the fireFoxDriver
		driver = new FirefoxDriver();

//		driver.get("http://localhost:8080/login.do");
		driver.get("http://facebook.com");
		
		WebElement emailText = driver.findElement(By.id("email"));
		int email_height = emailText.getSize().getHeight();
		int email_width = emailText.getSize().getWidth();
		
		
		WebElement pwText = driver.findElement(By.id("pass"));
		int pw_height = pwText.getSize().getHeight();
		int pw_width = pwText.getSize().getWidth();
		
		System.out.println("email_height : "+email_height);
		System.out.println("email_width : "+email_width);
		
		System.out.println("pw_height : "+pw_height);
		System.out.println("pw_width : "+pw_width);
		
		if(email_height==pw_height && email_width==pw_width)
		{
			System.out.println("Element IS Properly Align with Height and Width");
		}
		else
		{
			System.out.println("Not Align Properly");
		}

	}
}
