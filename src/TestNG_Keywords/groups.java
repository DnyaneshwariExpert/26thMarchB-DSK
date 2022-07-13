package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class groups {
  @Test(groups="Sanity")
  public void a() {
	  Reporter.log("a is running", true);
  }
  @Test(groups="Regression")
  public void c() {
	  Reporter.log("c is running", true);
  }

  @Test(groups="Sanity")
  public void b() {
	  Reporter.log("b is running", true);
  }

  @Test(groups="Regression")
  public void d() {
	  Reporter.log("d is running", true);
  }

}
