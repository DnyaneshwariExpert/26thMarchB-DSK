package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Include_Exclude {
  @Test
  public void a() {
	  Reporter.log("A is Running", true);
  }
  @Test
  public void j() {
	  Reporter.log("J is Running", true);
  }
  @Test
  public void m()
  {
	  Reporter.log("m is Running", true);
  }
  }

