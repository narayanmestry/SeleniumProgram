package com.bridgelabz.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.bridgelabz.base.Base;
import com.bridgelabz.keywordEngine.KeyWordAction;

public class TC_001_Login extends Base{
	public KeyWordAction keyWordAction;
	
	@Test
	public void loginTest() throws IOException
	{
		keyWordAction = new KeyWordAction();
		keyWordAction.startExicution("test");
		
		
		
		
	}
	
}
