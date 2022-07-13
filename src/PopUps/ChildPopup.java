package PopUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
	    driver.get("https://skpatro.github.io/demo/links/");  
       Thread.sleep(1000);
       String MainpageID = driver.getWindowHandle();
       System.out.println(MainpageID);
       Thread.sleep(1000);
       driver.findElement(By.name("NewWindow")).click();
       Thread.sleep(1000);
       //To handle multiple windows we need to have ID's
       Set<String> allPageID = driver.getWindowHandles();
       Iterator<String> ID = allPageID.iterator();
    
      while(ID.hasNext())
       {
    	  System.out.println(ID.next());
     }
	//driver.switchTo().window(ChildpageID);
	driver.manage().window().maximize();
	Thread.sleep(1000);
      
	driver.findElement(By.xpath("//div[@class=\"mobile-mini-widgets\"]")).sendKeys("Selenium");
	driver.switchTo().window(MainpageID);
	
	//driver.quit();
	
	
  
  
  
       
       
}
}