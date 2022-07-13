package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitehomePage {
  @FindBy(xpath="//span[@class='user-id']")private WebElement userName;
  @FindBy(xpath="//a[@target='_self']")private WebElement logout;
  
 public KitehomePage(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
 }
 
 public void validateUsername()
 {
	 String ExpectedUsername="ELR321";
	 String actualUsername=userName.getText();
	 if(ExpectedUsername.equals(actualUsername))
	 {
		 System.out.println("Actual and Expected user ID matching");
	 }
	 else
	 {
		 System.out.println("Actual and Expected user ID not matched");
	 }
 }
   public void logout()
   {
	   userName.click();
	   logout.click();
   }
}
