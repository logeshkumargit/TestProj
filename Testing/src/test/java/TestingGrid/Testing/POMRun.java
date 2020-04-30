package TestingGrid.Testing;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObj.PageObjMod;

public class POMRun {
	private static WebDriver driver = null;

	public static void main(String[] args)
	{
		googleSearch();
	}
	public static void googleSearch()
	{
		 String exepath = "C:\\Logesh\\Auto Sele\\chromedriver_win32\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exepath);
		 driver = new ChromeDriver();
		 driver.manage().window().maximize(); 
         driver.get("https://www.google.com");
         PageObjMod.textbox_search(driver).sendKeys("Automation");
         PageObjMod.button_search(driver).sendKeys(Keys.RETURN);
         driver.close();
	}
}
