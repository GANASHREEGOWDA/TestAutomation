package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task14 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
	Thread.sleep(2000);
	WebElement dropdowndemo = driver.findElement(By.id("select-multiple-native"));
	 WebElement add = driver.findElement(By.xpath("//button[.='Add']"));
	 WebElement remove = driver.findElement(By.xpath("(//select[@id='select-multiple-native'])[2]"));
	Select s=new Select(dropdowndemo);
	s.selectByValue("Running Shoes");
	s.selectByValue("Winter Coat");
	add.click();
	Thread.sleep(2000);
	Select s1=new Select(dropdowndemo);
	s1.selectByValue("Running Shoes");
	s1.selectByValue("Winter Coat");
	remove.click();
}
}