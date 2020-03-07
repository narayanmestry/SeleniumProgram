package com.interbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver = null;
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "uid")
	WebElement userId ;
	

	@FindBy(name = "password")
	WebElement password ;
	
	
	@FindBy(xpath="//input[@name = 'btnLogin']")
	WebElement login;
	
	public void enterUserId(String uname)
	{
		userId.sendKeys(uname);
	}

	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void loginClick()
	{
		login.click();
	}
}
