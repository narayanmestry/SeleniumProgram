package com.bridgelabz.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {
	WebDriver driver =null ;
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "pass")
	WebElement password;
	
	@FindBy(id = "loginbutton")
	WebElement submit ;
	
	@FindBy(xpath = "//div[@data-click='profile_icon']")
	WebElement profileIcon;
	
	
	public FacebookPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setEmail(String emailText)
	{
		email.sendKeys(emailText);
	}
	
	public void setPassword(String passwordText)
	{
		password.sendKeys(passwordText);
	}
	
	public void clickLogin()
	{
		submit.click();
	}
	
	public void clickProfileIcon()
	{
		profileIcon.click();
	}
}
