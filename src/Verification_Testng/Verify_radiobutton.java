package Verification_Testng;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verify_radiobutton {
	@Test
	public void mymethod()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practise.html");
		WebElement radiobutton1 = driver.findElement(By.xpath("//input[@value=\"Radio3\"]"));
		Assert.assertTrue(radiobutton1.isSelected(), "button is not selected TC is fail");
		
		
	}

}
