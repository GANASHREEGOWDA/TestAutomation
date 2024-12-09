package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task12
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
driver.navigate().to("file:///C:/Users/lenovo/OneDrive/Documents/text.html");
List<WebElement> txt=driver.findElements(By.xpath("//input"));
int count=txt.size();
for(int i=count-1 ;i>=1 ;i=i-2)
{
	WebElement text=txt.get(i);
	text.clear();
}
}
}
