package com.bridgelabz.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	static Properties property;
	static FileInputStream file ;
	
	public static Object fetchPropertyValue(String key) throws IOException {
		file = new FileInputStream("./config/config.properties");
		property = new Properties();
		property.load(file);
		return property.get(key);
	}

	
	public static String fetchLocatorValue(String key) throws IOException {
		// File For get Locator of WebElement
		file = new FileInputStream("./config/Element.properties");
		property = new Properties();
		property.load(file);
		return property.get(key).toString();
	}
}
