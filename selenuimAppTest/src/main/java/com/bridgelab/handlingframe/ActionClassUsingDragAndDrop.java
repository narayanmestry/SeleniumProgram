package com.bridgelab.handlingframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassUsingDragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"/home/adminstrator/eclipse-workspace/SeleniumTutorial/selenuimAppTest/driver/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		Thread.sleep(1000);

		Actions action = new Actions(driver);
		
		WebElement block4 = driver.findElement(By.id("block-4"));
		WebElement block2 = driver.findElement(By.id("block-2"));
		
//		action.dragAndDrop(block4, block2).perform();
		
		
		action.dragAndDropBy(block4, block2.getLocation().getX()+10,
				block2.getSize().getHeight()+10).perform();
		System.out.println("done");
		
//		Thread.sleep(6000);
//		driver.close();
	}
}
