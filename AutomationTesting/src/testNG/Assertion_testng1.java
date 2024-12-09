package testNG;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assertion_testng1 
{
	@Test
	public void signup() {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://facebook.com");
	String Expectedtitle="Facebook – log in or sign up";
	String Actualtitle = driver.getTitle();
    Assert.assertEquals(Actualtitle, Expectedtitle);
	System.out.println(Actualtitle);
	driver.quit();
}
}
