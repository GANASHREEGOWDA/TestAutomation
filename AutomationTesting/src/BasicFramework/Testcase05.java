package BasicFramework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase05 extends Genericscript
{
	@Test
	public void forgotpsw() 
	{
		boolean displayed = driver.findElement(By.xpath("//a[.='Forgotten password?']")).isDisplayed();
		boolean enabled = driver.findElement(By.xpath("//a[.='Forgotten password?']")).isEnabled();
		System.out.println(displayed +" "+ enabled);
	}
}
