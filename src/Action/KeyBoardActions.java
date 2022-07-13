package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(3000);
		WebElement text = driver.findElement(By.id("autocomplete"));
		Actions act=new Actions(driver);
		act.sendKeys(text, "Hello").perform();
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		act.click(dropdown).perform();
		Select s=new Select(dropdown);
		s.selectByValue("option2");
	
		

	}

}
