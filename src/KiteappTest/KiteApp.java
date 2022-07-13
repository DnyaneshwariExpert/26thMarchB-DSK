package KiteappTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteApp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		 WebElement userID = driver.findElement(By.id("userid"));
		 WebElement passWord = driver.findElement(By.id("password"));
		 WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		 userID.sendKeys("ELR321");
		 passWord.sendKeys("Dhana1111");
		 loginbutton.click();
		 Thread.sleep(1000);
		 WebElement pin = driver.findElement(By.id("pin"));
		 WebElement continueButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		 pin.sendKeys("982278");
		 continueButton.click();
		 WebElement UN = driver.findElement(By.xpath("//span[@class=\"user-id\"]"));
		String actualuserID = UN.getText();
		String expecteduserID = "ELR321";
		if(actualuserID.equals(expecteduserID))
		{
			System.out.println("User ID matching TC is passed");
		}
		else
		{
			System.out.println("User iD is not matching TC is not passed");
		}
UN.click();
  driver.findElement(By.xpath("//a[@target=\"_self\"]")).click();
  driver.close();
  
		

	}

}
