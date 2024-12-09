package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame3 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
driver.navigate().to("file:///C:/Users/lenovo/OneDrive/Documents/uframe.html");
WebElement usn=driver.findElement(By.xpath("//input[@type='text']"));
usn.sendKeys("shree");
driver.switchTo().frame("f1");
Thread.sleep(2000);

WebElement mob=driver.findElement(By.xpath("//input[@type='text']"));
mob.sendKeys("9768078967");
Thread.sleep(2000);

driver.switchTo().defaultContent();

Thread.sleep(2000);
driver.switchTo().frame("f2");
WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
email.sendKeys("shree@gmail.com");

	}

}
