package seleniumStudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondProg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String url=driver.getCurrentUrl();
		System.out.println("URL is "+url);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Sattu@yahoo.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Dnyana123");
		//driver.findElement(By.xpath("//button[@value='1']")).click();
		driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]"));
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().window().minimize();		
		driver.manage().window().minimize();
		//driver.close();
		driver.quit();
		
		

	}

}
