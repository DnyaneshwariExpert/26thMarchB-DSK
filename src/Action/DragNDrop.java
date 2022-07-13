package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {
 
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			Thread.sleep(1000);
			WebElement source = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
			WebElement dest = driver.findElement(By.id("amt7"));
			Actions act=new Actions(driver);
			act.dragAndDrop(source, dest).perform();
			
		

	}

}
