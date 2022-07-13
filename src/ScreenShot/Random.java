package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Random {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String str=RandomString.make(4);
		File Dest=new File("D:\\Velocity\\ScreenShot\\Dn" +str+ ".png");
		FileHandler.copy(Source, Dest);
		
		

	}
}
