package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Jse8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://cetonline.karnataka.gov.in/kea/");
Thread.sleep(2000);
WebElement ele= driver.findElement(By.xpath("//span[.='ಸಿ ಇ ಟಿ  ಬಗ್ಗೆ']"));

JavascriptExecutor js=(JavascriptExecutor)driver;
Thread.sleep(4000);
js.executeScript("document.body.style.zoom='60%'");
Thread.sleep(2000);
js.executeScript("document.body.style.zoom='160%'");
	}

}
