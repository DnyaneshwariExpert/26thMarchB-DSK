package seleniumStudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://vctcpune.com/selenium/practice.html");
		d.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hello");
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		d.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
		//d.close();
		//d.manage().window().maximize();
		//d.manage().window().minimize();
		System.out.println(d.getTitle());
		String Title=d.getTitle();
		System.out.println(Title);
		System.out.println(d.getCurrentUrl());
		

	}

}
