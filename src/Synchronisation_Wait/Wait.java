package Synchronisation_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.get("https://www.flipkart.com/");
		WebDriverWait ws=new WebDriverWait(driver,Duration.ofSeconds(100));
	WebElement wr = driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]"));
	wr.click();
	ws.until(ExpectedConditions.visibilityOf(wr));
		
		
		

	}

}
