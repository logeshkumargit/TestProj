package POMTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import TestPOM.TestPageOM.TestPom;

public class POMTestCase {
	@Test
	public static void verifyvalidLogin()
	{
		String exepath = "C:\\Logesh\\Auto Sele\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exepath);
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demosite.center/wordpress/wp-login.php");
		 TestPom TP = new TestPom(driver);
		 TP.login("Admin", "demo123");
		//testing
	}
	
}
