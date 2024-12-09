package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script10 
{
			public static void main(String[] args) 
			{
				System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("file:///C:/Users/lenovo/OneDrive/Documents/link.html");
				WebElement  ele=driver.findElement(By.id("l1"));
				ele.click();
			}

		}

