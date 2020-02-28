package com.bridgelab.javascriptexecutor;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;




public class JavaScriptExecutorDemo {
	public static void main(String[] args) throws InterruptedException{
		 System.setProperty("webdriver.chrome.driver","/home/adminstrator/eclipse-workspace/SeleniumTutorial/selenuimAppTest/driver/chromedriver/chromedriver");		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("file:///home/adminstrator/eclipse-workspace/SeleniumTutorial/selenuimAppTest/src/main/java/com/bridgelab/javascriptexecutor/sample.html");
		 
//		 driver.findElement(By.id("t1")).sendKeys("Mestry");
////		 driver.findElement(By.id("t2")).sendKeys("Mestry");  // here cant able to automate the value in text box
//   														     // where input textbox is Disable so here we will use javascriptExecutor
//		 
		 
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
	
		 
		 // Enter the value using Javascript;
		 
		 jse.executeScript("document.getElementById('t1').value='Mestry'");
//		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 
		 jse.executeScript("document.getElementById('t2').value = ''");
		 Thread.sleep(000);
		 jse.executeScript("document.getElementById('t2').value = 'NarayanMestry'");
		 Thread.sleep(5000);
		 jse.executeScript("document.getElementById('t2').type = 'button'");
		 // clear the Value using javascript Executor
//		 jse.executeScript("document.getElementById(t2).value = ' '");
		 Thread.sleep(5000);
		 driver.close();
	}
}
