																																																																																																																																																					package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox_Test {

	@Test
	public void myMethod()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Velocity\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		
																																																																																			
	}
}
