package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11 
{
	public static void main(String[] args) 
	{
	
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
driver.navigate().to("file:///C:/Users/lenovo/OneDrive/Documents/checkbox.html");
List<WebElement> cb=driver.findElements(By.xpath("//input"));
int count=cb.size();
for(int i=1;i<count;i=i+2)
{

	WebElement checkbox1=cb.get(i);
	checkbox1.click();

}
for(int j=count-1 ;j>=1 ;j=j-2)
{
	WebElement checkbox2=cb.get(j);
	checkbox2.click();
}
}
}