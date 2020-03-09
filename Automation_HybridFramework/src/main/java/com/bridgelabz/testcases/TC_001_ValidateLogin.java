package com.bridgelabz.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.bridgelabz.base.Base;
import com.bridgelabz.datagenerators.DataGenerator;
import com.bridgelabz.pages.LoginPage;

public class TC_001_ValidateLogin extends Base{

	@Test(dataProvider = "logindata",dataProviderClass = DataGenerator.class)
	public void check_Login(String email, String password) throws IOException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.EnterUserName(email);
		loginpage.EnterPassword(password);
		loginpage.clickLogin();
	}	
}
