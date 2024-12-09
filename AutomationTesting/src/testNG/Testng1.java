package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng1 {

	@Test
	public void testcase()
	{
		Reporter.log("Hello",true);
	}
}
