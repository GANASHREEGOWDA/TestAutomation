package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.navigate().to("https://www.shoppersstack.com/");
Thread.sleep(15000);
WebElement login=driver.findElement(By.xpath("//button[@id='loginBtn']"));
login.click();
Thread.sleep(15000);
WebElement usn=driver.findElement(By.xpath("//input[@id='Email']"));
usn.sendKeys("gowdru@gmail.com");
Thread.sleep(15000);
WebElement psw=driver.findElement(By.xpath("//input[@id='Password']"));
psw.sendKeys("Gana@2000");
Thread.sleep(15000);
WebElement log=driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[1]"));
log.click();
Thread.sleep(2000);
driver.close();
	}

}
