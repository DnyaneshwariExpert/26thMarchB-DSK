package Synchronisation_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				chrome.driver", "D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000));
		WebElement aboutUs = driver.findElement(By.xpath("//a[text()='About us'][1]"));
		wait.until(ExpectedConditions.visibilityOf(aboutUs));
		//wait.until(ExpectedConditions.alertIsPresent());
		
		aboutUs.click();

	}

}