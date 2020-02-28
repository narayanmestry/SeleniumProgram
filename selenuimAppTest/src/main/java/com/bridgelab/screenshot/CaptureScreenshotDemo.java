package com.bridgelab.screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenshotDemo {
	
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		Date date = new Date();
		System.setProperty("webdriver.gecko.driver",
				"/home/adminstrator/eclipse-workspace/SeleniumTutorial/selenuimAppTest/driver/geckodriver/geckodriver");
		// launch the fireFoxDriver
		driver = new FirefoxDriver();

		String date1 = date.toString();
		System.out.println(date1);

		String date2 = date1.replaceAll(":", "_");
		System.out.println(date2);

		driver.get("https://www.facebook.com");
		screenShot("google_screenShot");
		// Typecasting the driver object to TakesScreenshot interface type.


	}
	
	public static void screenShot(String filename) throws IOException
	{
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);

		File destFile = new File("/home/adminstrator/eclipse-workspace/SeleniumTutorial/selenuimAppTest/src/main/java/com/bridgelab/screenshot/"+filename+".jpg");
		FileUtils.copyFile(srcFile,destFile );
		
	}
}
