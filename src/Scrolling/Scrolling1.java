package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling1 {



	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com");
		Thread.sleep(1000);
		driver.manage().window().maximize();
       JavascriptExecutor js=((JavascriptExecutor)driver);		
	js.executeScript("window.scrollBy(80,4000)");
	Thread.sleep(1000);
	
	
             

	}

}
