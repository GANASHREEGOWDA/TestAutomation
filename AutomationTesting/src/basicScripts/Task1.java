package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/lenovo/OneDrive/Documents/task.html");
		WebElement usn=driver.findElement(By.id("t1"));
		usn.sendKeys("ganashreejn");
		WebElement psw=driver.findElement(By.name("n1"));
		psw.sendKeys("gana1234");
		WebElement confirmpsw=driver.findElement(By.className("c1"));
		confirmpsw.sendKeys("gana1234");
		usn.clear();
		WebElement link =driver.findElement(By.linkText("Instagram2024"));
		link.click();
		
	}
}
