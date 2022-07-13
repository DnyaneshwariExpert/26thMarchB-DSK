package TestNG_Keywords;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assert_Study {
	  @Test																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																										
	  public void Rc1() {
		   																																																																			String s="Dnyana";
		  String s1="Dnyanas";																																																																																																																																																																																																																																																																																																																																																																										
		  Assert.assertEquals(s,s1,"Result is not matching");
		  Reporter.log("Rc1 is Running",true);
		  Assert.assertNotNull(s1, "Result is not matching");
	  }
	  @Test
		public void Methos()
		{
			boolean a=true;
			boolean b=false;
			Assert.assertFalse(b,"Tc is match value is false");
		}
	  
	  
	   
  }
																												
