package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script34
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
	WebElement src1 = driver.findElement(By.id("box3"));
	WebElement dst1 = driver.findElement(By.id("box103"));
	WebElement src2 = driver.findElement(By.id("box2"));
	WebElement dst2 = driver.findElement(By.id("box102"));
	Actions a=new Actions(driver);
	a.dragAndDrop(src1, dst1).perform();
	a.dragAndDrop(src2, dst2).perform();
	
}
}
