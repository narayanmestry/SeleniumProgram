package selenuimAppTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
	public static void main(String[] args) {
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("ProjectPath : " + projectPath);

		// ****Test Run on Firefox
		 System.setProperty("webdriver.gecko.driver","/home/adminstrator/eclipse-workspace/SeleniumTutorial/selenuimAppTest/driver/geckodriver/geckodriver");
		 WebDriver driver = new FirefoxDriver();

		//	****Test Run on Chrome		
//		System.setProperty("webdriver.chrome.driver",
//				"/home/adminstrator/eclipse-workspace/SeleniumTutorial/selenuimAppTest/driver/chromedriver/chromedriver");
//		WebDriver driver = new ChromeDriver();

		driver.get("https://youtube.com/");
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println("Current URL ="+CurrentUrl);
		
		String Title = driver.getTitle();
		System.out.println("Current URL ="+Title);
		
		String getPageSource = driver.getPageSource();	// give source code of Page
		System.out.println("Current URL ="+getPageSource);
		
		
		
		driver.close();
//		driver.quit();   close the all running tab of chrome browser

	}
}
