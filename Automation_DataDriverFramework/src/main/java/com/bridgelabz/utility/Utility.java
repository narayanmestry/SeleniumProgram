package com.bridgelabz.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {

	/**
	 * @param key
	 * @return Object
	 * @throws IOException
	 */

	public static Object fetchPropertyValue(String key) throws IOException {
		// key reffer the value in Properties file
		FileInputStream file = new FileInputStream("./config/config.properties");

		// We have Properties class to fetch Properties value
		Properties property = new Properties();
		property.load(file); // load the file
		return property.get(key);
	}

	
	
	/**
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public static String fetchLocatorValue(String key) throws IOException {
		// File For get Locator of WebElement
		FileInputStream file = new FileInputStream("./config/Element.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(key).toString();
	}
}
