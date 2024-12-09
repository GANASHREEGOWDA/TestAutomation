package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script25 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.navigate().to("file:///C:/Users/lenovo/OneDrive/Documents/admin.html");
 WebElement usn=driver.findElement(By.xpath("//input[@type='text']"));
 Thread.sleep(4000);
usn.sendKeys(Keys.CONTROL+"a");
Thread.sleep(4000);
usn.sendKeys(Keys.BACK_SPACE);
	}

}
