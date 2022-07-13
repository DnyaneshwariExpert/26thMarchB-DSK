package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy1 {
  @Test
  public void recharge() {
	  Reporter.log("Recharge is done", true);
  }
  @BeforeMethod
  public void login()
  {
	 Reporter.log("Login is success", true); 
  }
  @BeforeClass
  public void launchBrowser()
  {
	  Reporter.log("Browser is launch", true);
  }
  @AfterMethod
  public void logOut()
  {
	  Reporter.log("LogOut Successfully", true);
  }
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Browser is closed", true);
  }
}
