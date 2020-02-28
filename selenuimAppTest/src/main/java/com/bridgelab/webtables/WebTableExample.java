package com.bridgelab.webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get(
				"file:///home/admin1/Downloads/SeleniumTutorial-master/selenuimAppTest/src/main/java/com/bridgelab/webtables/web.html");

		List<WebElement> tableRow = driver.findElements(By.tagName("tr"));
		System.out.println("Total number of Row :" + tableRow.size());

		List<WebElement> tableCol = driver.findElements(By.tagName("th"));
		System.out.println("Total number of Column :" + tableCol.size());

		List<WebElement> totalCells = driver.findElements(By.xpath("//th|//td"));
		System.out.println("total number  of Cells " + totalCells.size());
		int countNumber = 0;
		int sum = 0;
		for (WebElement element : totalCells) {
			String numberText = element.getText();
			try {
				int number = Integer.parseInt(numberText);
				System.out.println(" " + number);
				countNumber++;
				sum = sum + number;
			} catch (NumberFormatException e) {
			}
		}
		System.out.println("Sum is  " + sum);

		Thread.sleep(1000);
		driver.close();
	}

}
