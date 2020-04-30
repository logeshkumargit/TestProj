package PageOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	private static WebDriver driver = null;
	
 public static void main(String[] args) {
	googlesearchtest();
}
 public static void googlesearchtest()
 {
	 String exepath = "C:\\Logesh\\Auto Sele\\chromedriver_win32\\chromedriver.exe";
	 System.setProperty("webdriver.chrome.driver", exepath);
	 driver = new ChromeDriver();
	 PageObjM PO = new PageObjM(driver);
	 driver.get("https:www.google.com");
	 PO.setTextInSearchBox("Testing");
	 PO.clicksearch();
	 driver.close();
 }
}
