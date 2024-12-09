package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script29 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.navigate().to("https://www.amazon.com/");
List<WebElement> links=driver.findElements(By.xpath("//a"));
int count=links.size();
for(int i=0;i<count;i++)
{
	WebElement link=links.get(i);
	String url=link.getAttribute("href");
	System.out.println(url);
		
}
driver.quit();
	}

}
