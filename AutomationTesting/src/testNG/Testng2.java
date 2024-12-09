package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng2 
{
@Test
public void testcase1()
{
	Reporter.log("Hello",true);
}

@Test
public void testcase2()
{
	Reporter.log("Good morning",true);
}

}
