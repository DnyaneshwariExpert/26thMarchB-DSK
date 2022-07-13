package POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		
		KiteLoginPage login=new KiteLoginPage(driver);
		login.SendUserName();
		login.sendPassword();
		login.clickLoginPage();
		Thread.sleep(1000);
		KitePinPage page=new KitePinPage(driver);
		page.sendpin();
		page.clickOnContinueButton();
		Thread.sleep(1000);
		
		KitehomePage homepage=new KitehomePage(driver);
	    homepage.validateUsername();
	    homepage.logout();
	    
	    driver.close();

	}

}
