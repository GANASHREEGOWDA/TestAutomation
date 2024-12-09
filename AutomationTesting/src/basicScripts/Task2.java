package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/?gclid=EAIaIQobChMIqKfNlrCNiQMVPqlmAh3xZjFpEAAYASAAEgJU-PD_BwE&_rdr");
		WebElement phonenumber=driver.findElement(By.id("email"));
		phonenumber.sendKeys("123456789");
		WebElement  password=driver.findElement(By.name("pass"));
		password.sendKeys("ganashree");
		WebElement login=driver.findElement(By.id("loginbutton"));
		login.click();

		
	}

}
