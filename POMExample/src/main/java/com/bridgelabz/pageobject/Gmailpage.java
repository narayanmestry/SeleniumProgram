package com.bridgelabz.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Gmailpage {
	WebDriver driver = null;

	public Gmailpage(WebDriver driver) {
		this.driver = driver;
	}

	// step 2 . : Add Object locator
	By gmailId = By.id("identifierId");
	By next_Button = By.className("CwaK9");
	By gmailPassword = By.name("password");
	
	

	// Step 3 : add Action Method
	public void setEmailId(String email) {
		driver.findElement(gmailId).sendKeys(email);
		System.out.println("Email : "+driver.findElement(gmailId));
	}

	public void clickNextButton() {
		driver.findElement(next_Button).click();
		System.out.println("Buuton : "+driver.findElement(next_Button));
	}

	public void setPassword(String password) {
		driver.findElement(gmailPassword).sendKeys(password);
		System.out.println(driver.findElement(gmailPassword)+":Password");
		
	}

}
