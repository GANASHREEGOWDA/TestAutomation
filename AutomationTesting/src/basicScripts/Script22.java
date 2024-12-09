package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script22 {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.navigate().to("https://www.netflix.com/login");
WebElement usn=driver.findElement(By.name("userLoginId"));
String tn=usn.getTagName();
System.out.println(tn);
	}

}
