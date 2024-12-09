package basicScripts;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupchild1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
driver.navigate().to("https://www.flipkart.com/");


Thread.sleep(3000);
WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
search.sendKeys("iphone11");
search.submit();

Thread.sleep(3000);
WebElement iphone= driver.findElement(By.xpath("//div[.='Apple iPhone 11 (Black, 64 GB)']"));
iphone.click();

String window = driver.getWindowHandle();
Set<String> allwindow = driver.getWindowHandles();
for(String win:allwindow) {
	if(!win.equals(window))
	{
		driver.switchTo().window(win);
	}

	}
//Thread.sleep(3000);
//WebElement cart= driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2 JTo6b7']"));
//cart.click();

Thread.sleep(5000);
WebElement buynow= driver.findElement(By.xpath("(//button[@type='button'])[2]"));
buynow.click();

Thread.sleep(3000);
WebElement mob= driver.findElement(By.xpath("//input[@type='text']"));
mob.sendKeys("9741466996");

Thread.sleep(3000);
WebElement contin= driver.findElement(By.xpath("//button[@class='QqFHMw YhpBe+ _7Pd1Fp']"));
contin.click();

Thread.sleep(3000);
WebElement otp= driver.findElement(By.xpath("//input[@autocomplete='on']"));
otp.sendKeys("4567");

Thread.sleep(3000);
WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
login.click();

	}

}
