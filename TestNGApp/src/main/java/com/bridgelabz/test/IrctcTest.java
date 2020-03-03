package com.bridgelabz.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IrctcTest {
//	https://www.irctc.co.in/nget/profile/user-registration

	@FindBy(id = "userName")
	WebElement id;
	
	@FindBy(id = "usrPwd")
	WebElement password;
	
	@FindBy(id="cnfUsrPwd")
	WebElement cpassword;
	
	
	
}
