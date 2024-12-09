package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task9 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.navigate().to("http://106.51.87.42:9007");
Thread.sleep(2000);
WebElement usn=driver.findElement(By.xpath("//input[@id='email']"));
usn.sendKeys("Fresher@gmail.com");
Thread.sleep(2000);
WebElement psw=driver.findElement(By.xpath("//input[@id='password']"));
psw.sendKeys("Fresher@2024");
Thread.sleep(2000);
WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
login.click();
Thread.sleep(4000);
WebElement patient=driver.findElement(By.xpath("//a[@href='http://106.51.87.42:9007/index.php?doctor/patient']"));
patient.click();
Thread.sleep(4000);
WebElement addpt = driver.findElement(By.xpath("//button[@class='btn btn-primary pull-right']"));
addpt.click();
Thread.sleep(2000);
WebElement name=driver.findElement(By.xpath("(//input[@id='field-1'])[1]"));
name.sendKeys("xyz");
Thread.sleep(2000);
WebElement ph=driver.findElement(By.xpath("(//input[@id='field-1'])[4]"));
ph.sendKeys("9765789671");
Thread.sleep(2000);
WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
submit.click();
Thread.sleep(2000);
driver.quit();
	}

}
