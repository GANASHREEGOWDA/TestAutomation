package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver1= new ChromeDriver();
		driver1.get("https://www.flipkart.com");
		Thread.sleep(5000);
		driver1.close();
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver2= new FirefoxDriver();
		driver2.get("https://www.netflix.com");
		Thread.sleep(10000);
		driver2.quit();
		
		
				}

}
