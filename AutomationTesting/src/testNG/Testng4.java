package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng4
{
	@Test (priority = 0)
	public void signup()
	{
		Reporter.log("signup successfull");
	}

	@Test (priority = 1)
	public void login()
	{
		Reporter.log("login successfull");
	}
	
	@Test (priority = 2)
	public void homepage()
	{
		Reporter.log("homepage successfull");
	}

	@Test (priority = 3)
	public void logout()
	{
		Reporter.log("logout successfull");
	}
}
