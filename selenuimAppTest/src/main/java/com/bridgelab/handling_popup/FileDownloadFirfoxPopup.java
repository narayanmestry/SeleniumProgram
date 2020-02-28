package com.bridgelab.handling_popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloadFirfoxPopup {
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		
		// create FirefoxProfile class object 
		FirefoxProfile profile = new FirefoxProfile();
		
		// Set the key by which it will show the download popup on then screen
		String key = "browser.helperApps.neverAsk.saveToDisk";
		
		// set the type of the file which you want to download
		String value = "application/pdf";
		
		
		// Using the setPreferance() chenge the Sertting 
		profile.setPreference(key, value);
		
		// 0 - save to desktop,
		// 1 - save to download folder( default),
		// 2 - save to any other //location
		
		profile.setPreference("browser.download.folderlist",2);
		
		// save the file to given location 
		profile.setPreference("browser.download.dir","/home/admin1/chetan");
		
		// Use DesireCapability for chengig the  setting of Firefox browser \
		DesiredCapabilities cap = new DesiredCapabilities().firefox();
		cap.setCapability(FirefoxDriver.PROFILE, profile);
		
		
		// lanch the Firefox browser with modified setting 
		WebDriver driver = new FirefoxDriver(cap);

		driver.get("https://www.selenium.dev/downloads/");
		
		driver.findElement(By.linkText("3.141.59")).click();
		
		
		
		
		
		
		
		
		
		
		
	}
}

/*

	1. Auto IT 
	2. what is WebTable ? 
	3. How to handle Auto Suggestion list box ?
	4. How to select List Box ?
	5. How do you handle list box?
	6. handle list box using SELECT class.
	7. list box
	


*
*
*/
