package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task7 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
driver.navigate().to("https://demoapps.qspiders.com/ui");
Thread.sleep(1000);
 WebElement yes=driver.findElement(By.xpath("//button[@id='btn']"));
 Thread.sleep(1000);
 yes.click();
 Thread.sleep(1000);
 WebElement no=driver.findElement(By.xpath("//button[@id='btn3']"));
 Thread.sleep(1000);
 no.click();
 Thread.sleep(1000);
 WebElement one=driver.findElement(By.xpath("//button[@id='btn4']"));
 Thread.sleep(1000);
 one.click();
 Thread.sleep(1000);
 WebElement two=driver.findElement(By.xpath("//button[@id='btn5']"));
 Thread.sleep(1000);
 two.click();
 Thread.sleep(1000);
 WebElement three=driver.findElement(By.xpath("//button[@id='btn6']"));
 Thread.sleep(1000);
 three.click();
 Thread.sleep(1000);
 WebElement four=driver.findElement(By.xpath("//button[@id='btn7']"));
 Thread.sleep(1000);
 four.click();
 Thread.sleep(1000);
 WebElement five=driver.findElement(By.xpath("//button[@id='btn8']"));
 Thread.sleep(1000);
 five.click();
	}

}
