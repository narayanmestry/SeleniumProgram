package com.bridgelab.handlingframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame_Using_SwitchToDemo {
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","/home/adminstrator/eclipse-workspace/SeleniumTutorial/selenuimAppTest/driver/chromedriver/chromedriver");		
		 WebDriver driver = new ChromeDriver();
		 driver.get("file:///home/adminstrator/eclipse-workspace/SeleniumTutorial/selenuimAppTest/src/main/java/com/bridgelab/handlingframe/sample.html");
		 // Switch the Frame Using index
		 driver.switchTo().frame(0);
		 driver.findElement(By.id("innerText2")).sendKeys("Switch By Using Index ");
		 driver.switchTo().defaultContent();
		 driver.findElement(By.id("innerText1")).sendKeys("Switch Back to Parent by using defaultContent()");
		 Thread.sleep(3000);	 
		 
		 // Switch the frame using id
		 driver.switchTo().frame("f1");
		 driver.findElement(By.id("innerText2")).clear();
		 driver.findElement(By.id("innerText2")).sendKeys("Switch By Using Id");
		 driver.switchTo().parentFrame();
		 driver.findElement(By.id("innerText1")).clear();
		 driver.findElement(By.id("innerText1")).sendKeys("Switch Back to Parent by using parentFrame()");
		 Thread.sleep(3000);	
		 
		 // switch the Frame By using Name 
		 driver.switchTo().frame("n1");
		 driver.findElement(By.id("innerText2")).clear();
		 driver.findElement(By.id("innerText2")).sendKeys("Switch By using Name");
		 driver.switchTo().defaultContent();
		 driver.findElement(By.id("innerText1")).clear();
		 driver.findElement(By.id("innerText1")).sendKeys("Switch Back to Parent by using defaultContent()");
		 Thread.sleep(3000);
		 
		 // switch the Frame By Using WebElement 
		 //	--here the frame consider as webElement ,so first get it by classname or id and pass this webelement to switch()

		 WebElement frame_element  =  driver.findElement(By.className("c1"));
		 driver.switchTo().frame(frame_element);
		 driver.findElement(By.id("innerText2")).clear();
		 driver.findElement(By.id("innerText2")).sendKeys("Switch By Element");
		 driver.switchTo().parentFrame();
		 driver.findElement(By.id("innerText1")).clear();
		 driver.findElement(By.id("innerText1")).sendKeys("Switch Back By ParentFrame()");
		 Thread.sleep(3000);
		 driver.close();
	}
}
