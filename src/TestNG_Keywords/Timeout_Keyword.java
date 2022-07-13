package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeout_Keyword {
  @Test
  public void a() {
	  Reporter.log("a is running", true);
  }
  @Test(timeOut=2000)
  public void b()
  {
	  Reporter.log("b is running", true);
  }
  @Test
  public void c()
  {
	  Reporter.log("c is running", true);
  }
}
