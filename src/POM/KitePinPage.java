package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {
	//Data Member
	@FindBy(id="pin")private WebElement PIN;
	@FindBy(xpath="//button[@type=\'submit\']")private WebElement continueclick;
	
	//Constructor
	public KitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//3 method
	public void sendpin()
	{
		PIN.sendKeys("982278");
	}
	public void clickOnContinueButton()
	{
		continueclick.click();
	}
	

}
