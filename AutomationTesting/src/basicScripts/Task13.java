package basicScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task13 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/r.php");
	WebElement dropdownfb = driver.findElement(By.id("month"));
	Select s=new Select(dropdownfb);
	List<WebElement> opts = s.getOptions();
	int optscount = opts.size();
	System.out.println(optscount);//option count
	
	
	//option text
	for(int i=0;i<optscount;i++)
	{
		WebElement opt = opts.get(i);
		String txt= opt.getText();
		System.out.println(txt);
	}
	
	
	//ascending order
	ArrayList<String> arr1=new ArrayList<String>();
	for(int i=0;i<optscount;i++)
	{
		WebElement opt = opts.get(i);
		String txt1 = opt.getText();
		arr1.add(txt1);
	}
	Collections.sort(arr1);
	for(String ar1:arr1)
	{
		System.out.println(ar1);
	}
	
	
	//descending order
	ArrayList<String> arr2=new ArrayList<String>();
	for(int i=0;i<optscount;i++)
	{
		WebElement opt = opts.get(i);
		String txt2 = opt.getText();
		arr2.add(txt2);
	}
	Collections.sort(arr2,Collections.reverseOrder());
	for(String ar2:arr2)
	{
		System.out.println(ar2);
	}
	
	Thread.sleep(2000);
	driver.quit();
	
	
}
}
