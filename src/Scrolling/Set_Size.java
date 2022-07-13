package Scrolling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Size {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		System.out.println(driver.manage().window().getSize());
		Dimension d=new Dimension(1000,10);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());

	}

}
