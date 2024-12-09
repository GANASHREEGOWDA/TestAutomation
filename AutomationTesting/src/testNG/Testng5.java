package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng5
{
	@Test 
	public void signup()
	{
		Reporter.log("signup successfull");
	}

	@Test 
	public void login()
	{
		Reporter.log("login successfull");
	}
	
	@Test (enabled = false)
	public void homepage()
	{
		Reporter.log("homepage successfull");
	}

	@Test 
	public void logout()
	{
		Reporter.log("logout successfull");
	}
}
