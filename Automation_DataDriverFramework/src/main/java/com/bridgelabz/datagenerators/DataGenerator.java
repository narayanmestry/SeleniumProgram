package com.bridgelabz.datagenerators;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenerator {

	static FileInputStream file;
	static XSSFWorkbook workbook;

	static {
		try {
			file = new FileInputStream("./TestData/facebook.xlsx");
			workbook = new XSSFWorkbook(file); // Create Workbook Object : represent Excel Format

		} catch (FileNotFoundException e) {
		} 
		catch (IOException e) {
		}

	}

	@DataProvider(name = "logindata")
	public Object[][] login_TestDataGenerator() throws IOException {
		XSSFSheet loginsheet = workbook.getSheet("Login"); // Create Sheet Object
		// get number of row and column data in sheet
		int numberOfRow = loginsheet.getLastRowNum() + 1;
		// 2D array to store data
		Object[][] testData = new Object[numberOfRow][2];
		for (int i = 0; i < numberOfRow; i++) {
			XSSFRow row = loginsheet.getRow(i); // get row

			XSSFCell username = row.getCell(0); // get cell from row
			XSSFCell password = row.getCell(1); // get cell

			testData[i][0] = username.getStringCellValue(); // get String value from cell
			testData[i][1] = password.getStringCellValue(); // get String value cell
		}
//		workbook.close();
		return testData;
	}
	
	@DataProvider(name = "registerData")
	public Object[][] register_TestDataGenerator() 
	{
		// create sheet 
		XSSFSheet registerSheet = workbook.getSheet("register");
		// get number of row 
		int numberOfRow = registerSheet.getLastRowNum()+1;
		// create 2D array to store Excellsheeet data
		Object[][] testData = new Object[numberOfRow][4];
		
		for(int i = 0;i<numberOfRow;i++)
		{
			XSSFRow row = registerSheet.getRow(i);
			XSSFCell fname = row.getCell(0);
			XSSFCell lname = row.getCell(1);
			XSSFCell mobNo = row.getCell(2);
			XSSFCell password = row.getCell(3);
		
			testData[i][0] = fname.getStringCellValue();
			testData[i][1] = lname.getStringCellValue();
			testData[i][2] = mobNo.getStringCellValue();
			testData[i][3] = password.getStringCellValue();
			
		}
		
		return testData;
		
	}

}
