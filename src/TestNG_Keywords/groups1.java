package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class groups1 {
 
	  @Test(groups="Sanity")
	  public void e() {
		  Reporter.log("e is running", true);
	  }
	  @Test(groups="Regression")
	  public void f() {
		  Reporter.log("f is running", true);
	  }

	  @Test(groups="Sanity")
	  public void b() {
		  Reporter.log("b is running", true);
	  }

	  @Test(groups="Regression")
	  public void g() {
		  Reporter.log("g is running", true);
	  }

  }

