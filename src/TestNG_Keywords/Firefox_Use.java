package TestNG_Keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox_Use {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver", "D:\\Velocity\\GeckoDriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practise.html");
		
  }
}
