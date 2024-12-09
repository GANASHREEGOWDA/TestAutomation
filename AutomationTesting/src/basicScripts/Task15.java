package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task15 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/v1/");
		
		Thread.sleep(2000);
WebElement usn = driver.findElement(By.id("user-name"));
usn.sendKeys("standard_user");

Thread.sleep(2000);
WebElement pwd = driver.findElement(By.id("password"));
pwd.sendKeys("secret_sauce");

Thread.sleep(2000);
WebElement login= driver.findElement(By.id("login-button"));
login.click();

Thread.sleep(2000);
List<WebElement> allele= driver.findElements(By.xpath("//a"));
System.out.println(allele);

Thread.sleep(2000);
WebElement fp= driver.findElement(By.xpath("(//div[@class ='inventory_item_name'])[1]"));
fp.click();


WebElement fp1= driver.findElement(By.xpath("//div[@class='inventory_details_name']"));
String text1= fp1.getText();
System.out.println(text1);


WebElement fp2= driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
String text2= fp2.getText();
System.out.println(text2);

//replace dollar
//String text2= fp2.getText();
//String text5 = text2.substring(1); or replace or trim or split or replace all
//System.out.println(text5);

WebElement cart= driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']"));
cart.click();

WebElement cartsymbol= driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']"));
cartsymbol.click();

WebElement fpc1= driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
String text3= fpc1.getText();
System.out.println(text3);


WebElement fpc2= driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
String text4= fpc2.getText();
System.out.println(text4);

WebElement remove= driver.findElement(By.xpath("//button[@class='btn_secondary cart_button']"));
remove.click();

Thread.sleep(2000);
if(text1.equals(text2))
{
	if(text3.equals(text4))
	{
		System.out.println("both products are matching");
	}
}

Thread.sleep(1000);
WebElement hamberger= driver.findElement(By.xpath("//button[.='Open Menu']"));
hamberger.click();

Thread.sleep(1000);
WebElement logout= driver.findElement(By.id("logout_sidebar_link"));
logout.click();

Thread.sleep(2000);
driver.quit();


	}

}
