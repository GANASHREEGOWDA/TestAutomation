package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script26 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.navigate().to("https://www.facebook.com/");
WebElement usn=driver.findElement(By.id("email"));
Point loc = usn.getLocation();
System.out.println(loc);
int x=loc.getX();
int y=loc.getY();
System.out.println(x);
System.out.println(y);
	}

}
