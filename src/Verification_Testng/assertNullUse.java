package Verification_Testng;

import static org.testng.Assert.assertNull;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertNullUse {
  @Test
  public void myMethod() {
	  String a="Pune";
	  String b=null;
	  Assert.assertNotNull(b, "value is not null TC is fail");
	  Reporter.log("vALUE IS NULL,Tc is passed", true);
  }
  @Test
  public void mymethod1()
  {
	  String a=null;
	  Assert.assertNull(a, "Vale is not null Tc is fail");
	  Reporter.log("Value is null ,TC is passed", true);
  }
}
