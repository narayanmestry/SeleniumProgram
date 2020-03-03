package com.bridgelabz.pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bridgelabz.utility.Utility;

public class LoginPage {

	WebDriver driver =null;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void EnterUserName(String emailText) throws IOException
	{
		//Fetch the username from Element.properties file
		driver.findElement(By.id(Utility.fetchLocatorValue("login_username"))).sendKeys(emailText);
	}
	
	public void EnterPassword(String passwordText) throws IOException
	{
		//Fetch the password from Element.properties file
		driver.findElement(By.id(Utility.fetchLocatorValue("login_password"))).sendKeys(passwordText);
	}
	
	public void clickLogin() throws IOException
	{
		//Fetch the login from Element.properties file
		driver.findElement(By.id(Utility.fetchLocatorValue("login_button"))).click();
	}
}
