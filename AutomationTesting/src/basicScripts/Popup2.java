package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Popup2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		FirefoxOptions opt=new FirefoxOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new FirefoxDriver(opt);
		driver.manage().window().maximize();
		Thread.sleep(1000);
driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
Thread.sleep(2000);
WebElement ele=driver.findElement(By.id("browNotButton"));
ele.click();
	}

}
