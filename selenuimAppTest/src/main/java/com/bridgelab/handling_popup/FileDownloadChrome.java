package com.bridgelab.handling_popup;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloadChrome {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();

		String downloadPath = "/home/admin1/chetan";
		
		HashMap<String, Object> chromePref = new HashMap<String, Object>();
		
		chromePref.put("download.default_content_settings.popups",0);
		
		chromePref.put("download.default.directory",downloadPath);
		
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("prefs",chromePref);
		
		driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
	}
}
