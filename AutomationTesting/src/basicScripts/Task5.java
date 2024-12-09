package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Task5 {

	public static void main(String[] args) throws Exception
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.youtube.com/");
	WebElement searchbox=driver.findElement(By.cssSelector("input[id='search']"));
	searchbox.sendKeys("Mungaru Maleye");
	searchbox.submit();
	Thread.sleep(2000);
	WebElement video=driver.findElement(By.cssSelector("yt-formatted-string[class='style-scope ytd-video-renderer']"));
	video.click();
	
	

	}

}
