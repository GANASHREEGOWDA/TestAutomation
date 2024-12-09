package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert_testng
{
		@Test
		public void signup() 
		{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		String Expectedtitle="Facebook – log in or sign up";
		String Actualtitle = driver.getTitle();
		SoftAssert s=new SoftAssert();
	    s.assertEquals(Actualtitle, Expectedtitle);
		System.out.println(Actualtitle);
		driver.quit();
		s.assertAll();
	}
}
