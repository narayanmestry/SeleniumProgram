package com.bridgelabz.pageobject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class IRCTCPage {
	WebDriver driver; 
	
	By dropdown = By.cssSelector("div.h_menu_drop_button.hidden-xs");	
	By loginButton = By.cssSelector("button.search_btn");
	By u_Id = By.id("userId");
	By u_password = By.id("pwd");
//	By u_captch = By.id("nlpCaptchaImg");
	By u_signin = By.className("search_btn");
	
	public IRCTCPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickDropdown() {
		driver.findElement(dropdown).click();  // use CssSelectors
	}

	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}

	public void SetUserId(String userId) {
		driver.findElement(u_Id).sendKeys(userId);
	}

	public void setPassword(String password) {
		driver.findElement(u_password).sendKeys(password);
	}

//	public void CapchaProcess(String text) throws IOException, TesseractException {
//		File src = driver.findElement(u_captch).getScreenshotAs(OutputType.FILE);
//		
//		String path = System.getProperty("user.dir")+"/screenshots/captcha.png";
//		
//		FileHandler.copy(src, new File(path));
//		
//		ITesseract image = new Tesseract();
//		String imagetext = image.doOCR(new File(path));
//		System.out.println(imagetext);
//		System.out.println(text);
//			
//		
//	}

	public void clickSignIn() {
		driver.findElement(u_signin).click();
	}

	
}
