package basicScripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script3 {

	public static void main(String[] args) 
	{
		
			String key1 = "webdriver.chrome.driver";
			String value1 = "./softwares/chromedriver.exe";
			String key2 = "webdriver.gecko.driver";
			String value2 = "./softwares/geckodriver.exe";
			
			System.setProperty(key1,value1);
			ChromeDriver driver1 = new ChromeDriver();
			System.setProperty(key2,value2);
			FirefoxDriver driver = new FirefoxDriver();
		

	}

}
