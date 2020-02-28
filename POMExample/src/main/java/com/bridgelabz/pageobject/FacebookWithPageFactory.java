package com.bridgelabz.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookWithPageFactory {
	WebDriver driver = null;
	//Locators
	@FindBy(id = "email")
	WebElement email;
	@FindBy(id = "pass")
	WebElement password;
	@FindBy(id = "loginbutton")
	WebElement submit;
	
	
	public FacebookWithPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	// action methods

	// Set Email
	public void setEmail()
	{
		email.sendKeys("mestryn9727@gmail.com");
	}
	
	public void setPassword()
	{
		password.sendKeys("chetan@123");
	}
	
	public void clickSubmit()
	{
		submit.click();
	}
}

