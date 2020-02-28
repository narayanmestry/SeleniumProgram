package com.bridgelab.webtables;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("file:///home/admin1/Downloads/SeleniumTutorial-master/selenuimAppTest/src/main/java/com/bridgelab/webtables/SelectDemo.html");
	
		WebElement listbox = driver.findElement(By.id("cars"));
		Select select = new Select(listbox);
		

		List<WebElement> options = select.getOptions();		// return all value present in Select Tag
		System.out.println("All Option are :");
		for(WebElement option:options)
		{
			String text = option.getText();
			System.out.println(text);
		}

		
		
		select.selectByIndex(1);	// Select the Value By Index
		
		
		select.selectByValue("audi");	//select the value By value 
		
		
		select.selectByVisibleText("Mercedes SLK");	   //select the value By Visible Text
		
		
		// Total # option we have selected so print this 3 option 
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		System.out.println("\n\nThere are "+selectedOptions.size()+" Option are Selected");
		
		
		// Selected option are :
		System.out.println("\n\nSelected Optinos are :");
		for(WebElement selectedOption : selectedOptions)
		{
			String text = selectedOption.getText();
			System.out.println(text);
		}
	
		
		
		
		// check Weather we can select multiple Or not 
		System.out.println("\n\ncan We Select Multiple ?");
		Thread.sleep(1000);
		boolean multiple = select.isMultiple();
		if(multiple)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
		
		WebElement firstSelected =select.getFirstSelectedOption(); // to get First Selected Item
		System.out.println("First Selected : "+firstSelected.getText());
		
//		select.deselectByVisibleText("Mercedes SLK");	// we can use deselectByVisibleText() for MultiSelect
//		// Selected option are :

		
		
		// Print the Content of the Optinos in Sorted order 
		ArrayList<String> list = new ArrayList<String>();
		for(WebElement option:options)
		{
			String text = option.getText();
			System.out.println(text);
			list.add(text);
		}
		Collections.sort(list);
		System.out.println("Sorted list : "+list);
		for(String car : list)
		{
			System.out.println(car);
		}
		
		
		
		
		
		driver.close();
	}
}
