package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
  @Test
  public void a() {
	  Reporter.log("A is Running", true);
  }
  @Test(priority=-1)
  public void j() {
	  Reporter.log("J is Running", true);
  }
  @Test(priority=1)
  public void m()
  {
	  Reporter.log("m is Running", true);
  }
}
