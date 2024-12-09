package basicScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Jse1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lenovo/OneDrive/Desktop/SELENIUM/JSE.html");
Thread.sleep(2000);
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("document.getElementById('a1').value='gana'");



	}

}
