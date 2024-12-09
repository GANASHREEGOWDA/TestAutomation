package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Script15 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lenovo/OneDrive/Documents/css.html");
		WebElement usn=driver.findElement(By.cssSelector("input[type='text']"));
		usn.sendKeys("gana");
		WebElement cb=driver.findElement(By.cssSelector("input[type='checkbox']"));
		cb.click();
		WebElement rb=driver.findElement(By.cssSelector("input[type='radio']"));
		rb.click();
		WebElement link=driver.findElement(By.cssSelector("a[href='https://www.youtube.com']"));
		link.click();
		driver.quit();
		
	}

}
