package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng3
{
	@Test (invocationCount = 2)
	public void testcase1()
	{
		Reporter.log("Hello",true);
	}

	@Test (invocationCount = 0)
	public void testcase2()
	{
		Reporter.log("Good morning",true);
	}
}
