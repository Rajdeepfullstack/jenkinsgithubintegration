package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	
	@Test
	public void TC001() {
		
		System.out.println("Inside testcase TC001");
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.magicbricks.com");
		driver.manage().window().maximize();
		driver.quit();
		
	}

}
