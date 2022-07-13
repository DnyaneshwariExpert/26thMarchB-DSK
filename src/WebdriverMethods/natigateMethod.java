package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class natigateMethod {

	public static void main(String[] args) throws InterruptedException {
	               System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
	       		WebDriver driver=new ChromeDriver();
	               driver.get("https://www.amazon.in/");
	               Thread.sleep(1000);
	               driver.navigate().to("https://www.google.com/");
	               Thread.sleep(1000);
	               driver.navigate().back();
	               String str = driver.getCurrentUrl();
	               System.out.println(str);
	               
	               
	               
	               
	               
	               
	               

	}

}
