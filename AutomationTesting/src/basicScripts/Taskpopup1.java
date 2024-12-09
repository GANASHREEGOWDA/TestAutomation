package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Taskpopup1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
driver.navigate().to("https://busonlineticket.com/booking/bus-tickets.aspx");

Thread.sleep(1000);
driver.findElement(By.id("txtOriginGeneral")).click();

Thread.sleep(1000);
driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]")).click();

Thread.sleep(1000);
driver.findElement(By.id("txtDestinationGeneral")).click();

Thread.sleep(1000);
driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]")).click();

Thread.sleep(1000);
driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();

Thread.sleep(1000);
driver.findElement(By.xpath("//a[.='29']")).click();

Thread.sleep(1000);
driver.findElement(By.id("txtReturnDateBooking")).click();

Thread.sleep(1000);
driver.findElement(By.xpath("//a[.='30']")).click();

Thread.sleep(2000);
driver.findElement(By.id("btnBusSearchNewGeneral")).click();

Thread.sleep(4000);
driver.findElement(By.xpath("(//p[@class='text-lg'])[2]")).click();

Thread.sleep(12000);
driver.findElement(By.xpath("(//small[.='L1'])[1]")).click();
driver.findElement(By.xpath("(//small[.='L2'])[1]")).click();
driver.findElement(By.xpath("(//small[.='L3'])[1]")).click();
driver.findElement(By.xpath("(//small[.='L4'])[1]")).click();
driver.findElement(By.xpath("(//small[.='L5'])[1]")).click();
driver.findElement(By.xpath("(//small[.='L6'])[1]")).click();

Thread.sleep(1000);
driver.findElement(By.xpath("(//button[@type='button'])[27]")).click();

Thread.sleep(1000);
driver.findElement(By.id("btn-alert-okay")).click();




	}

}
