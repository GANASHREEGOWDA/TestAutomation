package basicScripts;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takess2 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
driver.get("https://www.instagram.com");

Date d=new Date();
String d1 = d.toString().replace(":", "-");
System.out.println(d1);

TakesScreenshot ts=(TakesScreenshot)driver;

WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
File temploc = usn.getScreenshotAs(OutputType.FILE);
File perloc=new File("./Screenshots/Element.png");
FileHandler.copy(temploc,perloc);
Thread.sleep(1000);
driver.quit();

	}

}
