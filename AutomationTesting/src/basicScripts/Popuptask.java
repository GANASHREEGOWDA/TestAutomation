package basicScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Popuptask {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Thread.sleep(1000);
		driver.navigate().to("https://www.selenium.dev/downloads/");

		WebElement net = driver.findElement(By.xpath("(//p[@class='card-text m-0 pb-1'])[1]"));
		WebElement ruby = driver.findElement(By.xpath("(//a[@class='card-link'])[4]"));
		WebElement python = driver.findElement(By.xpath("(//a[@class='card-link'])[10]"));
		WebElement js = driver.findElement(By.xpath("(//a[@class='card-link'])[13]"));
		
		

		/*
		 * Thread.sleep(1000); Actions a=new Actions(driver);
		 * a.contextClick(net).perform();
		 * 
		 * Thread.sleep(1000); Robot r=new Robot(); r.keyPress(KeyEvent.VK_DOWN);
		 * r.keyRelease(KeyEvent.VK_DOWN); r.keyPress(KeyEvent.VK_ENTER);
		 * r.keyRelease(KeyEvent.VK_ENTER);
		 * 
		 * Thread.sleep(1000);
		 * 
		 * a.contextClick(ruby).perform();
		 * 
		 * Thread.sleep(1000); Robot r1=new Robot(); r1.keyPress(KeyEvent.VK_DOWN);
		 * r1.keyRelease(KeyEvent.VK_DOWN); r1.keyPress(KeyEvent.VK_ENTER);
		 * r1.keyRelease(KeyEvent.VK_ENTER);
		 * 
		 * Thread.sleep(1000);
		 * 
		 * a.contextClick(python).perform();
		 * 
		 * Thread.sleep(1000); Robot r2=new Robot(); r2.keyPress(KeyEvent.VK_DOWN);
		 * r2.keyRelease(KeyEvent.VK_DOWN); r2.keyPress(KeyEvent.VK_ENTER);
		 * r2.keyRelease(KeyEvent.VK_ENTER);
		 * 
		 * Thread.sleep(1000);
		 * 
		 * a.contextClick(js).perform();
		 * 
		 * Thread.sleep(1000); Robot r3=new Robot(); r3.keyPress(KeyEvent.VK_DOWN);
		 * r3.keyRelease(KeyEvent.VK_DOWN); r3.keyPress(KeyEvent.VK_ENTER);
		 * r3.keyRelease(KeyEvent.VK_ENTER);
		 */

		ArrayList<WebElement> arr = new ArrayList<>();
		arr.add(net);
		arr.add(ruby);
		arr.add(python);
		arr.add(js);

		{

			Actions a = new Actions(driver);
			Robot r = new Robot();
			for (int i = 0; i < arr.size(); i++) {
				WebElement ar = arr.get(i);
				a.contextClick(ar).perform();

				Thread.sleep(1000);

				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
			}
			 Set<String> win = driver.getWindowHandles();
			 ArrayList<String> arr1=new ArrayList<String>(win);
			for (int i = 0; i< arr1.size(); i++) 
			{
				String ar1 = arr1.get(i);
				driver.switchTo().window(ar1);
				System.out.println(ar1);
				Thread.sleep(1000);
				driver.close();
		}
			
	}
	}
}
