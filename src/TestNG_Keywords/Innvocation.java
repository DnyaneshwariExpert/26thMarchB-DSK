package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Innvocation {
  @Test(invocationCount=4)
  public void Messege() {
	  Reporter.log("Hello,Welcome to my World", true);
  }
  @Test
  public void Msg()
  {
	  Reporter.log("Hiiiiiiiiiiiiiiii", true);
  }
}
