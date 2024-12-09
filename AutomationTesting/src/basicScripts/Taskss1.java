package basicScripts;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Taskss1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in");


 List<WebElement> links = driver.findElements(By.xpath("//img"));
int count = links.size();
for(int i=0;i<count;i++)
{
	WebElement link = links.get(i);
	
	File temploc = link.getScreenshotAs(OutputType.FILE);
File perloc=new File("./Screenshots/links"+i+".png");
FileHandler.copy(temploc,perloc);
//driver.quit();
}
	}
}
