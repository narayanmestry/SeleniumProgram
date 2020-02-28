package com.bridgelab.activeElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCssValueOfActive {
	static WebDriver driver ;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",
				"/home/adminstrator/eclipse-workspace/SeleniumTutorial/selenuimAppTest/driver/geckodriver/geckodriver");
		// launch the fireFoxDriver
		driver = new FirefoxDriver();

//		driver.get("http://localhost:8080/login.do");
		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&next=https%3A%2F%2Fwww.facebook.com%2F&lwv=120&lwc=1647001");
		
		driver.findElement(By.id("loginbutton")).click();
		
		 WebElement element = driver.findElement(By.xpath("//div[@role = 'alert']"));
		 String text = element.getText();
		 System.out.println("Message : "+text);

		 String color = element.getCssValue("color");
		 System.out.println("Color :"+color);

		 String fontsize = element.getCssValue("font-size");
		 System.out.println("Color :"+fontsize);
				 
				 
		
		
	driver.close();
		
		
	}
}
