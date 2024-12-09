package BasicFramework;

import org.testng.annotations.Test;

public class Testcase08  extends Genericscript
{
	@Test
public void link()
{
		System.out.println(driver.getPageSource());
}
}
