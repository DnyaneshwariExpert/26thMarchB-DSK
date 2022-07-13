package Scrolling;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		System.out.println(driver.manage().window().getPosition());
		Point p=new Point(20, 20);
		driver.manage().window().setPosition(p);
		System.out.println(driver.manage().window().getPosition());
		

	}

}
