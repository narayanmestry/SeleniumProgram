package com.bridgelabz.assertion;

import org.openqa.selenium.WebDriver;

public class Compare {

	
	/**
	 * @param driver
	 * @param expPath
	 * @return true if page is validate 
	 */
	public boolean validatePage(WebDriver driver, String expPath) {
		boolean flag = false;
		if (driver.getCurrentUrl().equalsIgnoreCase(expPath)) {
			flag = true;
		}
		return flag;
	}

	
	/**
	 * @param driver
	 * @param expTitle
	 * @return true if PageTitle is  validate
	 */
	public boolean validateTitle(WebDriver driver,String expTitle)
	{
		boolean flag = false;
		if(driver.getTitle().equalsIgnoreCase(expTitle))
		{
			flag = true;
		}
		return flag;
	}
}
