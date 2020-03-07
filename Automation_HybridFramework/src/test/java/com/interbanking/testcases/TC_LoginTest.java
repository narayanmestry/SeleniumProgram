package com.interbanking.testcases;

import org.testng.annotations.Test;

import com.interbanking.base.Base;
import com.interbanking.pageobjects.Login;

public class TC_LoginTest extends Base {
	
	@Test
	public void LoginTest()
	{
		Login login = new Login(driver);
		driver.get(applicationURL);
//		logger.info("URL is navigated");
		 
		login.enterUserId(username);
//		logger.info("Username is Entered ");
		login.enterPassword(password);
//		logger.info("Password is Entered ");
		login.loginClick();
//		logger.info("CLicked the Button");
		
//		if(driver.getTitle().equalsIgnoreCase(" GTPL Bank Manager HomePage "))
//		{
//			Assert.assertTrue(true);
//			logger.info("Test pass :");
//		
//		}
//		else
//		{
//			Assert.assertTrue(false);
//			logger.info("Test Faild :");
//				
//		}
	}
	
	
}
