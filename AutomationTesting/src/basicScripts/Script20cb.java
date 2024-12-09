package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script20cb {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.navigate().to("file:///C:/Users/lenovo/OneDrive/Documents/WE1.html");
 WebElement CB=driver.findElement(By.xpath("//input[@type='checkbox']"));
if(CB.isDisplayed())
{
	if(CB.isEnabled())
	{
		if(CB.isSelected())
		{
			System.out.println("it is selected");
			CB.click();
		}
	else
	{
		System.out.println("it is not selected");
	}
}
else
{
	System.out.println("it is disabled");
}
}
else
{
System.out.println("it is not disabled");
	}
	}
}
