package Verification_Testng;

import org.testng.annotations.Test;
import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassert {
	@Test
	public void Methos()
	{
		boolean a=true;
		boolean b=false;
		Assert.assertFalse(a,"tc IS FAIL value is true");
		Assert.assertNotNull(b, "Tc is failed value is null");
	}
   
}
