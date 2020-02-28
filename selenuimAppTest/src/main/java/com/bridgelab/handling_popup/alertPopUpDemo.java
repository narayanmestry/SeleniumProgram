package com.bridgelab.handling_popup;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertPopUpDemo {

	public static void main(String[] args) throws Exception{
		
//		System.setProperty("webdriver.chrome.driver",
//				"/home/admin1/Downloads/SeleniumTutorial-master/selenuimAppTest/driver/chromedriver/chromedriver");
//		WebDriver driver = new ChromeDriver();
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='button'][@value='Say my name!']")).click();
		Thread.sleep(1000);
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		
		System.out.println(alert.getText());
		Thread.sleep(1000);

		alert.sendKeys("Narayan Mestry");
		Thread.sleep(1000);
		alert.accept();
		Thread.sleep(10000);
		
		System.out.println(alert.getText());

		
		
		driver.close();
	}

}
