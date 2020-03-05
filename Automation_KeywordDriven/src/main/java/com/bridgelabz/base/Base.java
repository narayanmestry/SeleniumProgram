package com.bridgelabz.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bridgelabz.utility.Utility;

public class Base {
	public WebDriver driver;

	public void initiateBrowser(String browserName) throws IOException {
		if (browserName.equalsIgnoreCase("chrome")) {
			// Configuration of chrome
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			// Configuration of firefox
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
			driver = new FirefoxDriver();
		} else{
			// Configuration of By default browser
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
			driver = new ChromeDriver();
		}

	}

	public void closeDriverInstance() {
		driver.close();  
	}
}
