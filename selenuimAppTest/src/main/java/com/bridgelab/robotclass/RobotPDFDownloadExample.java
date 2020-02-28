package com.bridgelab.robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotPDFDownloadExample {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver",
				"/home/adminstrator/eclipse-workspace/SeleniumTutorial/selenuimAppTest/driver/geckodriver/geckodriver");
		// launch the fireFoxDriver
		WebDriver driver = new FirefoxDriver();

	
		// Enter the URL																																						
//		driver.get("http://www.orimi.com/pdf-test.pdf");
		driver.navigate().to("http://www.orimi.com/pdf-test.pdf");
		// click on download button
		driver.findElement(By.id("download")).click();
		// Create Robot class
		Robot r = new Robot();
		
		// Press the Key
		r.keyPress(KeyEvent.VK_ENTER);
		// Release the Key
		r.keyRelease(KeyEvent.VK_ENTER);
		
		// op : it downloaf the PDF
	
//		driver.close();
//		driver.quit();
		
	}
}
