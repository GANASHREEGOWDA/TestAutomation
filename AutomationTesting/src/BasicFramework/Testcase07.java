package BasicFramework;

import org.testng.annotations.Test;

public class Testcase07 extends Genericscript
{
	@Test
public void url()
{
		System.out.println(driver.getCurrentUrl());
}
}
