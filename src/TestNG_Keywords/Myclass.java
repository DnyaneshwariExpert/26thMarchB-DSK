package TestNG_Keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myclass {
  @Test
  public void Mymethod() {
	  System.setProperty("webdriver.chrome.driver","D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
  }
}
