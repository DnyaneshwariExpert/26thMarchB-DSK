package Verification_Testng;


import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assert {
	  @Test																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
	  public void Rc2() {
		 String s="Dnyana";
		  String s1="Dnyanas";	
		  SoftAssert sa=new SoftAssert();
		  sa.assertNotEquals(s,s1,"both are equal tc is Failed");
		 sa.assertNull(s1, "value is not null,TC is failed");
		 sa.assertAll();
	  }
	 @Test
	  public void Rc3()
	  {
		  boolean a=true;
		  boolean b=false;
		  SoftAssert s=new SoftAssert();
		  s.assertTrue(b, "Value is false TC is failed");
		  s.assertFalse(a, "Value is true TC is failed");
		  s.assertAll();
	  }
  
}
