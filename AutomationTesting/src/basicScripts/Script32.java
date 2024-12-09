package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script32
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
driver.navigate().to("https://www.flipkart.com");
List<WebElement> links=driver.findElements(By.xpath("//a"));
for(WebElement link:links)
{
	String text=link.getText();
	System.out.println(text);
}
}
}