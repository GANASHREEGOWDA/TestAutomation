package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script20 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.navigate().to("file:///C:/Users/lenovo/OneDrive/Documents/WE1.html");
 WebElement USN=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
if(USN.isDisplayed())
{
	if(USN.isEnabled())
	{
		USN.sendKeys("GANA");
	}
	else
	{
		System.out.println("USN is disabled");
	}
}
else
{
	System.out.println("USN IS NOT DISPLAYED");
}
	}

}
