package com.bridgelabz.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bridgelabz.utility.Utility;

public class RegisterPage {
	WebDriver driver = null;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterFirstName(String firstname) throws IOException {
		driver.findElement(By.cssSelector(Utility.fetchLocatorValue("register_firstname"))).sendKeys(firstname);
	}	

	public void enterLastName(String lastname) throws IOException {
		driver.findElement(By.cssSelector(Utility.fetchLocatorValue("register_lastname"))).sendKeys(lastname);
	}

	public void enterMobileNo(String mobno) throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("register_mobileno"))).sendKeys(mobno);
//		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("ieieee");
	}

	public void enterNewPassword(String password) throws IOException {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("register_password"))).sendKeys(password);
//		driver.findElement(By.name("reg_passwd__")).sendKeys("DDDDDD");
	}

}
