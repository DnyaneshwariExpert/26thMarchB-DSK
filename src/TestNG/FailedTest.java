package TestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedTest {
		@Test
		public void V1()
		{
			Reporter.log("V1 is Running",true);
		}
		@Test
		public void V2()
		{
			Reporter.log("V2 is Running,true");
		}
		@Test
		public void V3()
		{
			Reporter.log("V3 is Running", true);
	        Assert.fail();
		}
		@Test
		public void V4()																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						
		{
			Reporter.log("V4 is Running", true);
	        Assert.fail();
		}
		
	}
