package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script21 {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.navigate().to("https://www.netflix.com/login");
WebElement usn=driver.findElement(By.name("userLoginId"));
String an=usn.getAttribute("autocomplete");
System.out.println(an);
	}

}
