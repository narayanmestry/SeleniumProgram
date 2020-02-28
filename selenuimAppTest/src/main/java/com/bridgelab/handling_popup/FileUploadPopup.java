package com.bridgelab.handling_popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@multiple='']")).sendKeys("/home/admin1/Downloads/Selenium Notes.pdf");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='button'][@ng-click='item.upload()']")).click();	
//		driver.close();

	}

}
