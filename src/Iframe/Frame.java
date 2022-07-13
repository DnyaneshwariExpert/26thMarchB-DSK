package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/iframes/");
		Thread.sleep(3000);
		String tx=driver.findElement(By.xpath("//a[text()='Blogger']")).getText();
		System.out.println(tx);
		driver.switchTo().frame(0);
		String tx1=driver.findElement(By.id("frametext")).getText();
		System.out.println(tx1);
		driver.switchTo().parentFrame();
		String tx2=driver.findElement(By.linkText("Pavilion")).getText();
		System.out.println(tx2);
		driver.switchTo().frame("Frame2");
		String tx3=driver.findElement(By.xpath("//a[text()='Category3']")).getText();
		System.out.println(tx3);
		driver.switchTo().parentFrame();
		String tx4=driver.findElement(By.linkText("Pavilion")).getText();
		System.out.println(tx4);
		
		
}
	
	
}