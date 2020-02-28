package com.bridgelab.webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class autoSuggetionExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
//		List<WebElement> allOptions =driver.findElements(By.xpath("//*[contains(text(),'selenium ')]"));
		List<WebElement> allOptions =driver.findElements(By.xpath("//*[contains(text(),'selenium  ')]"));
		
		int count = allOptions.size();
		System.out.println("number of value Present in Drop down is :"+count);

		String expectedValue="selenium interview questions";
		
		// Print all the Auto Suggetion Value :
		for(WebElement option : allOptions)
		{
			String text = option.getText();
			System.out.println(" "+text);
		
			if(text.equalsIgnoreCase(expectedValue))
			{
				option.click();
				break;
			}
		}
	
		Thread.sleep(1000);
		driver.close();
	
	}
	

}
