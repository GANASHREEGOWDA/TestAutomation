package BasicFramework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase06 extends Genericscript
{
	@Test
	public void create() 
	{
		boolean displayed = driver.findElement(By.xpath("(//a[@role='button'])[2]")).isDisplayed();
		boolean enabled = driver.findElement(By.xpath("(//a[@role='button'])[2]")).isEnabled();
		System.out.println(displayed +" "+ enabled);
	}

}
