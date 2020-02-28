package com.bridgelabz.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLogin {
	
	WebDriver driver = null;
	public FacebookLogin(WebDriver driver) {

		this.driver = driver;
			
	}
	
	// add the locator
	By email = By.id("email");
	By pass =By.id("pass");
	By submit = By.id("loginbutton");
	
	// Action method 
	
	// Set the Mail 
	public void setEmail(String textEmail)
	{
		driver.findElement(email).sendKeys(textEmail);
	}
	
	//set the Password
	public void setPassword(String textPass)
	{
		driver.findElement(pass).sendKeys(textPass);
	}
	
	// click on submit
	public void clickSubmit()
	{
		driver.findElement(submit).click();
	}
	
}
