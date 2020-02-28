package com.bridgelab.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDownDemo {
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","/home/adminstrator/eclipse-workspace/SeleniumTutorial/selenuimAppTest/driver/chromedriver/chromedriver");		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.selenium.dev/");
		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 int x,y;
		 WebElement element = driver.findElement(By.xpath("//img[contains(@src,'subject7_logo')]"));
		 
		 System.out.println(element.getTagName());
		 
		 int imgX = element.getLocation().getX();
		 int imgY = element.getLocation().getY();
		 
		 System.out.println(imgX);
		 System.out.println(imgY);
		 
		 
		 js.executeScript("window.scrollBy("+imgX+","+(imgY-100)+")");
		 Thread.sleep(1000);
		 
		 for(int i=1;i<=5;i++)
		 {
			 js.executeScript("window.scrollBy(0,-200)");
			 System.out.println("DownScroll");
			 Thread.sleep(200);
		 }
		 
		 for(int i=1;i<=5;i++)
		 {
			 js.executeScript("window.scrollBy(0,200)");
			 System.out.println("Upscroll");
			 Thread.sleep(200);
		 }
		  
//		 Thread.sleep(2000);
//		 driver.close();
	}
}
