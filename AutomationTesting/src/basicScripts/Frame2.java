package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame2 {

	public static void main(String[] args)  throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
driver.navigate().to("file:///C:/Users/lenovo/OneDrive/Documents/usn.html");
WebElement usn=driver.findElement(By.xpath("//input[@type='text']"));
usn.sendKeys("shree");
Thread.sleep(2000);
WebElement f1=driver.findElement(By.xpath("//iframe[@id='f1']"));
driver.switchTo().frame(f1);
Thread.sleep(2000);
WebElement psw=driver.findElement(By.xpath("//input[@type='text']"));
psw.sendKeys("shree@2000");
Thread.sleep(2000);
WebElement f2=driver.findElement(By.xpath("//iframe[@id='f1']"));
driver.switchTo().frame(f2);
Thread.sleep(2000);
WebElement mob=driver.findElement(By.xpath("//input[@type='text']"));
mob.sendKeys("9768078967");
Thread.sleep(2000);
WebElement f3=driver.findElement(By.xpath("//iframe[@id='f1']"));
driver.switchTo().frame(f3);
Thread.sleep(2000);
WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
email.sendKeys("shree@gmail.com");
Thread.sleep(2000);
email.clear();
driver.switchTo().parentFrame();
mob.clear();
Thread.sleep(2000);
driver.switchTo().defaultContent();
usn.clear();
	}

}
