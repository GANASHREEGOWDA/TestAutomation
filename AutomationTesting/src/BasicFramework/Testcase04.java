package BasicFramework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase04 extends Genericscript
	{
		@Test
		public void login() 
		{
			boolean displayed = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
			boolean enabled = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
			System.out.println(displayed +" "+ enabled);
		}
}
