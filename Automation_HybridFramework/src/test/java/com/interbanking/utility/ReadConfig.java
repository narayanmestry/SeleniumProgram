package com.interbanking.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties property;
	public ReadConfig() {
		try {
		FileInputStream file = new FileInputStream("./config/config.properties");
		property = new Properties();
		property.load(file);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	public String getApplicationURL()
	{
		String url = property.getProperty("applicationURL");
		return url;
	}
	
	public String userName()
	{
		String username = property.getProperty("username");
		return username;
	}
	
	public String password()
	{
		String password = property.getProperty("password");
		return password;
	}
		
}
