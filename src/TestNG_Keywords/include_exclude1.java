package TestNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class include_exclude1 {
  @Test
  public void x() {
	  Reporter.log("x is Running", true);
  }
  @Test
  public void y() {
	  Reporter.log("y is Running", true);
  }
  @Test
  public void c()
  {
	  Reporter.log("c is Running", true);
  }

  }

