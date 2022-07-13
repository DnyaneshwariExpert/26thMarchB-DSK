package seleniumStudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		//driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		//driver.findElement(By.xpath("//h1[contains(text(),'Welcome To')]"));
		driver.findElement(By.xpath("//input[@value='option3'][3]"));

	}

}
