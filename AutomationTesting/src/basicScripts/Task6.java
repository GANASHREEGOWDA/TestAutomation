package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task6 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/maps/@13.0012817,77.5487917,13z?entry=ttu&g_ep=EgoyMDI0MTAxNC4wIKXMDSoASAFQAw");
		WebElement direction=driver.findElement(By.xpath("//span[@class='google-symbols NhBTye G47vBd']"));
		direction.click();
		Thread.sleep(2000);
		WebElement s1=driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @placeholder='Choose starting point, or click on the map...']"));
		s1.sendKeys("rajajinagar");
		Thread.sleep(2000);
WebElement s2=driver.findElement(By.xpath("//input[@tooltip='Choose destination, or click on the map...']"));
		s2.sendKeys("shivamogga");
		
		


	}

}
