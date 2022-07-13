package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(2000);
		driver.findElement(By.id("alertBox")).click();
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		Thread.sleep(4000);
		driver.findElement(By.id("confirmBox")).click();
		Alert al1=driver.switchTo().alert();
		System.out.println(al1.getText());
		al1.dismiss();
		driver.findElement(By.id("promptBox")).click();
		Alert al2=driver.switchTo().alert();
		al2.sendKeys("Hi");
		String text=al2.getText();
		System.out.println(text);
		//al2.sendKeys("Hello,Dnyana");
		//driver.findElements(By.id(text));
	
		
	}
	

}
