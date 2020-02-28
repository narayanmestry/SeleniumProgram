package selenuimAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverManagerTest {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://fundoopush-dev.bridgelabz.com/login");
		driver.findElement(By.id("mat-input-0")).sendKeys("mestryn9727@gmail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("mestryn1234");
		driver.findElement(By.className("button-div")).click();


	}
}
