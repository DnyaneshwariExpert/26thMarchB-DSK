package Verification_Testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsuse {
  @Test
  public void mymethod() {
	  String a="Pune";
	  String b="Pune1";
     // Assert.assertEquals(a, b,"a and b are not equal TC is fail");
      //Reporter.log("a and b equals TC is pass");
	  Assert.assertNotEquals(a, b,"a and b are equal TC is Fail");
	  Reporter.log("a and b are not equals TC is pass",true);
	  
}
}
