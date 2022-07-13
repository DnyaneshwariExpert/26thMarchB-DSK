package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
     driver.manage().window().maximize();
     Thread.sleep(1000);
    WebElement text=driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
    System.out.println(text);
     driver.switchTo().frame("frame1");
     driver.findElement(By.tagName("input")).sendKeys("Dnyana");
     driver.switchTo().frame("frame3");
     driver.findElement(By.id("a")).click();
     driver.switchTo().defaultContent();
     
     driver.switchTo().frame("frame2");
     WebElement element=driver.findElement(By.id("animals"));
     Select s=new Select(element);
     System.out.println(s.isMultiple());
    // s.selectByIndex(1);
     s.selectByVisibleText("Baby Cat");
     driver.switchTo().defaultContent();
    
  
     

	}

}
