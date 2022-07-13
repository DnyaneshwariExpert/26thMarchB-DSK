package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://lakmeindia.com");
        Thread.sleep(3000);
     //   driver.findElement(By.id("optInText")).click();//for allow option click
        driver.findElement(By.xpath("//button[@class='ng-binding']")).click();
	}

}
