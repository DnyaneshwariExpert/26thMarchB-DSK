package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_Study {
  @Test
  public void method() {
	  Reporter.log("User ID is Validated", true);;
  }
  @Test
  public void method1()
{
	  Reporter.log("Dashboard is validated", true);
}
  @BeforeMethod
  public void Login()
  {
	  Reporter.log("Login is Success", true);
  }

  @BeforeClass
 public void launch()
 {
	  Reporter.log("URl is Launched", true);
 }
   @AfterMethod
  public void Logout()
  {
	  Reporter.log("Logging Out...", true);
  }
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Browser closed", true);
  }
  
}
