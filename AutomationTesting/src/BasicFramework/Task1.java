package BasicFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task1
{
@Test
public void facebook() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	driver.navigate().to("https://www.facebook.com/");
	
	 WebElement usn = driver.findElement(By.id("email"));
	 usn.sendKeys("gana");
	 WebElement psw = driver.findElement(By.id("pass"));
	 psw.sendKeys("Gana@2906");
	
	Thread.sleep(2000);
	driver.navigate().refresh();
	                       /*if u don't write address again 
	                       it will throw stale element exception*/
	Thread.sleep(2000);
	usn = driver.findElement(By.id("email"));
	usn.sendKeys("ganashree");
	
	Thread.sleep(2000);
	psw = driver.findElement(By.id("pass"));
	psw.sendKeys("Ganashree@2906");
	
	driver.quit();
}
}
//open chrome browser
//enter fb url
//locate usn store ref variable,locate psw store ref variable
//enter usn using ref variable and enter psw using ref variable
//refresh page
//again enter usn and psw using same ref variable