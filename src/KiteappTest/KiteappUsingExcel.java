package KiteappTest;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteappUsingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		File myfile=new File("D:\\Velocity\\TestExcel.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
		String UN = mysheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = mysheet.getRow(0).getCell(1).getStringCellValue();	
		String PIN =mysheet.getRow(0).getCell(2).getStringCellValue();
		 System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		WebElement userID = driver.findElement(By.id("userid"));
		 WebElement passWord = driver.findElement(By.id("password"));
		 WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		 userID.sendKeys(UN);
		 passWord.sendKeys(PWD);
		 loginbutton.click();
		 Thread.sleep(1000);
		 WebElement pin = driver.findElement(By.id("pin"));
		 WebElement continueButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		 pin.sendKeys(PIN);
		 continueButton.click();
		 Thread.sleep(1000);
		 WebElement UName = driver.findElement(By.xpath("//span[@class=\"user-id\"]"));
		 String actualuserID = UName.getText();
			String expecteduserID = UN;
			if(actualuserID.equals(expecteduserID))
			{
				System.out.println("User ID matching TC is passed");
			}
			else
			{
				System.out.println("User iD is not matching TC is not passed");
			}
	UName.click();
	  driver.findElement(By.xpath("//a[@target=\"_self\"]")).click();
	  driver.close();
	  
		 

		 
		
		
		
		

	}

}
