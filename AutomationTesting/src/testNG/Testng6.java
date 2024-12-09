package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng6 
{
	@Test 
	public void signup()
	{
		Reporter.log("signup successfull");
	}

	@Test (dependsOnMethods = "signup")
	public void login()
	{
		//Assert.fail();
		Reporter.log("login successfull");
	}
	
	@Test (dependsOnMethods = "login")
	public void homepage()
	{
		Reporter.log("homepage successfull");
	}

	@Test (dependsOnMethods = "homepage")
	public void logout()
	{
		Reporter.log("logout successfull");
	}
}
