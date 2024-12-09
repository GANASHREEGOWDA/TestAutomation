package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
driver.get("file:///C:/Users/lenovo/OneDrive/Desktop/FUP.html");
/*WebElement fup=driver.findElement(By.id("f"));
fup.sendKeys("C:\\Users\\lenovo\\OneDrive\\Desktop\\API");*/
	}

}
