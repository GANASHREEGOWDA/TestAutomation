package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
driver.navigate().to("file:///C:/Users/lenovo/OneDrive/Documents/mainpage1.html");
WebElement usn=driver.findElement(By.xpath("//input[@type='text']"));
usn.sendKeys("shree");
Thread.sleep(2000);
//driver.switchTo().frame(0);
//driver.switchTo().frame("f1");
WebElement f1=driver.findElement(By.xpath("//iframe[@id='f1']"));
driver.switchTo().frame("f1");
WebElement psw=driver.findElement(By.xpath("//input[@type='text']"));
psw.sendKeys("shree@2000");

	}

}