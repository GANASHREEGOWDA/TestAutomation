package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frametask1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
driver.navigate().to("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");

WebElement f1= driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
driver.switchTo().frame(f1);

Thread.sleep(2000);

WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
email.sendKeys("shree@gmail.com");

WebElement psw1=driver.findElement(By.xpath("//input[@type='password']"));
psw1.sendKeys("shree");

WebElement cpsw=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
cpsw.sendKeys("shree");

driver.switchTo().defaultContent();

WebElement f2= driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
driver.switchTo().frame(f2);

WebElement usn=driver.findElement(By.xpath("//input[@type='text']"));
usn.sendKeys("shree123");

WebElement psw2=driver.findElement(By.xpath("//input[@type='password']"));
psw2.sendKeys("shree06");


	}

}
