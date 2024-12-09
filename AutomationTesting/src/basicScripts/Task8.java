package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.navigate().to("file:///C:/Users/lenovo/OneDrive/Documents/task8.html");
Thread.sleep(2000);
WebElement usn=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
usn.sendKeys(Keys.CONTROL+"a");
Thread.sleep(2000);
usn.sendKeys(Keys.CONTROL+"x");
Thread.sleep(2000);
WebElement cpsw=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
cpsw.sendKeys(Keys.CONTROL+"v");
Thread.sleep(2000);
WebElement psw=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
psw.sendKeys(Keys.CONTROL+"a");
Thread.sleep(2000);
psw.sendKeys(Keys.CONTROL+"x");
Thread.sleep(2000);
usn.sendKeys(Keys.CONTROL+"v");
Thread.sleep(2000);
cpsw.sendKeys(Keys.CONTROL+"a");
Thread.sleep(2000);
cpsw.sendKeys(Keys.CONTROL+"x");
Thread.sleep(2000);
psw.sendKeys(Keys.CONTROL+"v");
Thread.sleep(2000);
driver.quit();


	}

}
