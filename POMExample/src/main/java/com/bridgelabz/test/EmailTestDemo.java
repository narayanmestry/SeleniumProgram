package com.bridgelabz.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bridgelabz.pageobject.Gmailpage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmailTestDemo {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		EmailLogin(driver);

//		driver.close();
//		driver.quit();
	}

	public static void EmailLogin(WebDriver driver) throws InterruptedException {
		System.out.println("Driver : " + driver);
		Gmailpage gmailpage = new Gmailpage(driver);

//		driver.get("https://accounts.google.com/signin/v2/sl/pwd?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&navigationDirection=forward");
		driver.navigate().to(
				"https://accounts.google.com/signin/v2/sl/pwd?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&navigationDirection=forward");
		// wait for element to driver .
		waitForTime(3);
		// send Mail
		gmailpage.setEmailId("mestrychetan11@gmail.com");
		gmailpage.clickNextButton();
		// wait for element to driver .
		waitForTime(3);
		// Enter the Password
		gmailpage.setPassword("chetan123");
		gmailpage.clickNextButton();
		// wait for element to driver .
		waitForTime(5);


	}

	public static void waitForTime(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

}
