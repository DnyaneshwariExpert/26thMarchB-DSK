package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	  
	//1.data members
	@FindBy(id="userid")private WebElement userName;
	@FindBy(id="password")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginButton;
	
	//2.Constructor
	 public KiteLoginPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 //3.methods
	 public void SendUserName() {
		 userName.sendKeys("ELR321");
	 }
	public void sendPassword()
	{
		password.sendKeys("Dhana1111");
		
	}
	public void clickLoginPage()
	{
		loginButton.click();
	}

}
