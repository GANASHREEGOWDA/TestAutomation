package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Task4 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		WebElement name=driver.findElement(By.cssSelector("input[id='name']"));
		name.sendKeys("ganashree");
		WebElement email=driver.findElement(By.cssSelector("input[id='email']"));
		email.sendKeys("ganashreejn@gmail.com");
		WebElement psw=driver.findElement(By.cssSelector("input[id='password']"));
		psw.sendKeys("gana1234");
		WebElement reg=driver.findElement(By.cssSelector("button[type='submit']"));
		reg.click();
		

	}

}
