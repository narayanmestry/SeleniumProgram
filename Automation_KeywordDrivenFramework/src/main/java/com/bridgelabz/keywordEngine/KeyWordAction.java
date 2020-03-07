package com.bridgelabz.keywordEngine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bridgelabz.base.Base;
import com.bridgelabz.utility.Utility;

public class KeyWordAction extends Base{

	public WebDriver driver;
//	public Properties property;

	public WebElement element;
	


	
	public void startExicution(String sheetname) throws IOException {
		String locatorName = null;
		String locatorValue=null;
		
		FileInputStream file = new FileInputStream("/home/admin1/eclipse-workspace/SeleniumTutorial/Automation_KeywordDriven/TestData/sample.xlsx");
		System.out.println(file.available());
		
		XSSFWorkbook workbook = new XSSFWorkbook(file); // Create Workbook Object : represent Excel Format
		System.out.println(workbook);
		
	
		System.out.println(workbook.getSheetName(0)+":<<Sheet name");
		XSSFSheet loginsheet = workbook.getSheet("test"); // Create Sheet Object
		
		int numberOfRow = loginsheet.getLastRowNum() + 1;
		int k=0;
		for(int i =0;i<numberOfRow;i++)
		{
			// Take locator Column Value / name
			try
			{
			String locator_col_Value = loginsheet.getRow(i+1).getCell(k+3).toString().trim(); 	//eg . : Id = email
			if(!locator_col_Value.equalsIgnoreCase("NA"))
			{
				locatorName = locator_col_Value.split("=")[0].strip();	// id
				locatorValue = locator_col_Value.split("=")[1].strip(); // email
			}
			
			// TAke action col value 
			
			String action = loginsheet.getRow(i).getCell(k+4).toString().trim();
			String value = loginsheet.getRow(i).getCell(k+5).toString().trim();
			
			// Write Switch Statement for Browser Opeation 
			switch (action) {
			case "openBrowser":
				if(value.isEmpty()||value.equalsIgnoreCase("NA"))
				{
					initiateBrowser(Utility.fetchPropertyValue("browserName").toString().trim());
				}
				initiateBrowser(value);
				
				break;

			case "navigate" :
				if(value.isEmpty()||value.equalsIgnoreCase("NA"))
				{
					driver.get(Utility.fetchPropertyValue("applicationURL").toString().trim());
				}
				else
				{
					driver.get(value);
				}
				break;
				
			case "closeBrowser":
				closeDriverInstance();
				break;
				
			default:
				break;
			}
			
			
			// Switch Statement for Locator
			switch (locatorName) {
			case "id":
				 element = driver.findElement(By.id(locatorValue));
				if(action.equalsIgnoreCase("enterEmail"))
				{
					element.clear(); 
					element.sendKeys(value);
				}
				else if(action.equalsIgnoreCase("click"))
				{
					element.click();
				}
				locatorName = null;
				break;

			default:
				break;
			}
			}catch (Exception e) {
				System.out.println("Null pointer Exception");
			}
			
		}	
		
		

	}
	
}
