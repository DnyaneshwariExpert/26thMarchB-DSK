																																																																																																																																																																															package SetsizeAndposition;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPostion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
																																																																																																																																																																																																																																																																			WebDriver driver = null;
																																																																																																																																																																																																																																																																																																																																																			System.out.println(driver.manage().window().getPosition());
		Point p=new Point(200,200);
		driver.manage().window().setPosition(p);
		
		

	}

}
