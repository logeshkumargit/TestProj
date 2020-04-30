package TestPOM.TestPageOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestPom {
	
	WebDriver driver;
By username = By.id("user_login");
By password = By.id("user_pass");
By Login = By.id("wp-submit");

public TestPom(WebDriver driver)
{
	this.driver = driver;
}

public void login(String Uid, String pass)
{
	driver.findElement(username).sendKeys(Uid);
	driver.findElement(password).sendKeys(pass);
	driver.findElement(Login).click();
	
	//Testing
}
}
