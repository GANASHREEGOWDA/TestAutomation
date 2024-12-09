package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Taskjse1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
WebElement fb = driver.findElement(By.xpath("(//a[@class='nav_a'])[5]"));
Point loc= fb.getLocation();
int y = loc.getY();

JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,"+y+")");
Thread.sleep(2000);
fb.click();
	}

}
