package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Jse4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lenovo/OneDrive/Desktop/JSE1.html");
Thread.sleep(2000);
WebElement usn = driver.findElement(By.xpath("//input[@class='c1']"));

JavascriptExecutor js=(JavascriptExecutor) driver;
Thread.sleep(2000);
js.executeScript("arguments[0].value=' '",usn);

	}

}
