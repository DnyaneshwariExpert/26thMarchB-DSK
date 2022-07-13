package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalClass {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			Thread.sleep(1000);
			driver.get("https://kite.zerodha.com/");
		

	}

}
