package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args)
			{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		WebElement phnum=driver.findElement(By.cssSelector("input[id='email']"));
		phnum.sendKeys("gana");
		WebElement psw=driver.findElement(By.cssSelector("input[id='pass']"));
		psw.sendKeys("1234");
		WebElement login=driver.findElement(By.cssSelector("div[class='_xkt']"));
		login.click();
		

	}

}
