package Listener_Study;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener{
	
	@Override
	public void onTestSuccess(ITestResult result) {
	
		Reporter.log("Test case is Pass",true);
	}
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("Take ScreenShot",true);
		System.out.println("Fail test case name is " +result.getName());
	}
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("Test case is skipped due to depends on method2");
	}
}
