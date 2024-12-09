package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
driver.get("https://www.redbus.in/");

driver.findElement(By.id("onwardCal")).click();

driver.findElement(By.xpath("//span[.='29']")).click();
	}

}
