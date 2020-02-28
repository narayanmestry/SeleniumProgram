package com.bridgelabz.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

	WebDriver driver;

	@FindBy(name = "q")
	WebElement text;

	@FindBy(name = "btnK")
	WebElement button;
	
	public GooglePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setText(String googleText)
	{
		text.sendKeys(googleText);
	}
	
	public void clickButton()
	{
		button.click();
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
}
