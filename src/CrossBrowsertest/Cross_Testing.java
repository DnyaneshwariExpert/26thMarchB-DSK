package CrossBrowsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Testing {
	@Parameters("BrowserName")
  @Test
  public void mymethod(String name) throws InterruptedException {
		
		WebDriver driver=null;
		  if(name.equals("Firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver", "D:\\Velocity\\GeckoDriver\\geckodriver.exe");
				 driver=new FirefoxDriver();
				
			  }
		  else if(name.equals("chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver","D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
			   driver=new ChromeDriver();
			  
		  }
		  driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
		 Thread.sleep(2000);
		 driver.close();
		  }
}
