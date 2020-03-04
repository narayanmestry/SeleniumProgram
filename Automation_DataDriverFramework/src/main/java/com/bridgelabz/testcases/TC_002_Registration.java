package com.bridgelabz.testcases;

import com.bridgelabz.pages.RegisterPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.bridgelabz.base.Base;
import com.bridgelabz.datagenerators.DataGenerator;

public class TC_002_Registration extends Base {
	@Test(dataProvider = "registerData", dataProviderClass = DataGenerator.class)
	public void checkRegistration(String fname, String lname, String mobNo, String password) throws IOException {
		RegisterPage register = new RegisterPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		register.enterFirstName(fname);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		register.enterLastName(lname);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		register.enterMobileNo(mobNo);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		register.enterNewPassword(password);
	}
}
