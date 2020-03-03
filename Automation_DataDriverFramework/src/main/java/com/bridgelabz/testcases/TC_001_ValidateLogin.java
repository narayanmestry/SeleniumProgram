package com.bridgelabz.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.bridgelabz.base.Base;
import com.bridgelabz.pages.LoginPage;

public class TC_001_ValidateLogin extends Base{

	@Test(dataProvider = "ExcelData")
	public void check_Login(String email, String password) throws IOException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.EnterUserName(email);

		loginpage.EnterPassword(password);

		loginpage.clickLogin();

	}

	@DataProvider(name = "ExcelData")
	public Object[][] testDataGenerator() throws IOException {

		FileInputStream file = new FileInputStream("./TestData/facebookLogin.xlsx"); // Read the Data from ExelSheet

		XSSFWorkbook workbook = new XSSFWorkbook(file); // Create Workbook Object : represent Excel Format

		XSSFSheet loginsheet = workbook.getSheet("Login"); // Create Sheet Object
		loginsheet = workbook.getSheetAt(0);
		// get number of row and column data in sheet
		int numberOfRow = loginsheet.getLastRowNum()+1;
		

		// 2D array to store data
		Object[][] testData = new Object[numberOfRow][2];

		for (int i = 0; i < numberOfRow; i++) {
			XSSFRow row =loginsheet.getRow(i); 			// get row
			
			XSSFCell username = row.getCell(0);			// get cell from row
			XSSFCell password = row.getCell(1);			// get cell 
	
			testData[i][0] = username.getStringCellValue();		// get String value from cell
			testData[i][1] = password.getStringCellValue(); 	// get String  value cell
		}

		return testData;
	}
}
