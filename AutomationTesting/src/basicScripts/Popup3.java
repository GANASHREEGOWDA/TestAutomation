package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
driver.get("https://admin:admin@demoapps.qspiders.com/ui/auth?sublist=0");
Thread.sleep(4000);
WebElement login=driver.findElement(By.id("AuthLink"));
Thread.sleep(1000);
login.click();
	}

}