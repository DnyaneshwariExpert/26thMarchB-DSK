package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Invocation_study {
  @Test(invocationCount=4)
  public void MyWorld() {
	  Reporter.log("Welcome to My world",true);
  }
  @BeforeClass
  public void Launch()
  
  {
	  Reporter.log("Browser is Launch", true);
  }
  @BeforeMethod
  public void login()
  {
	  Reporter.log("Login Successfully",true);
  }
  @AfterMethod 
  public void logout()
  {
	  Reporter.log("Logout Successfully",true);
  }
  @AfterClass
  public void close()
  {
	  Reporter.log("Browser is closed", true);
  }
  
}
