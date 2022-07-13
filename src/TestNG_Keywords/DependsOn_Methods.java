package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOn_Methods {
  @Test(priority=0)
  public void Test1() {
	  Reporter.log("Test1 is running", true);
  }
  @Test(dependsOnMethods="Test3")
  public void Test2()
  {
	  Reporter.log("Test2 is Running", true);
  }
  @Test
  public void Test3()
  {
	  Reporter.log("Test3 is running", true);
  }
  }

