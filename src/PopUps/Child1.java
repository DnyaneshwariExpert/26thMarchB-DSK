package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
        Thread.sleep(1000); 
        driver.findElement(By.xpath("//button[text()='No thanks']")).click();     	                                                                                                                                                                                                                                                                                                                                                                                                                          
         Thread.sleep(2000);
         //driver.findElement(By.tagName("q")).sendKeys("honda");
	}}