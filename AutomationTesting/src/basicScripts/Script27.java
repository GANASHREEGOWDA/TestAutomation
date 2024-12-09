package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script27 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.navigate().to("https://www.facebook.com/");
WebElement usn=driver.findElement(By.id("email"));
int h=usn.getSize().getHeight();
int w=usn.getSize().getWidth();
System.out.println(h +" "+ w);

	}

}
