package Listener_Study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener_Study.Listener.class)

public class MyMethod {
  @Test
  public void Method1() {
	  Reporter.log("Method is passed",true);  
}
  @Test
  public void Method2()
  {
	  Reporter.log("Method2 is fail",true);
	  Assert.fail();
  }
  @Test(dependsOnMethods="Method2")
  public void Method3()
  {
	  Reporter.log("Method3 is Fail due to Method2",true);
  }
}