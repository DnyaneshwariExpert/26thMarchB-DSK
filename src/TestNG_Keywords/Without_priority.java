package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Without_priority {
  @Test
  public void b() {
	  Reporter.log("Hello", true);
  }
  @Test
  public void d()
  {
	  Reporter.log("D is running", true);
  }
  @Test
  public void a()
  {
	  Reporter.log("a is running",true);
  }
}
