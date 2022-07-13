import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[@ajaxify=\"/reg/spotlight/\"]")).click();
		Thread.sleep(1000);

		WebElement Day=driver.findElement(By.id("day"));
		Select s=new Select(Day);
		Thread.sleep(1000);

		s.selectByValue("30");
		WebElement Month=driver.findElement(By.id("month"));
		Select s1=new Select(Month);
		s1.selectByIndex(4);
		WebElement Year=driver.findElement(By.id("year"));
		Select s2=new Select(Year);
		s2.selectByVisibleText("1994");
		Thread.sleep(1000);
		s2.selectByVisibleText("2022");
		Thread.sleep(1000);
		driver.quit();


	}

}
