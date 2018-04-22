import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProductPrice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d =  new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.navigate().to("https://www.flipkart.com/");
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("Apple iPhone X ");
		d.findElement(By.xpath("//button[@class='vh79eN']")).submit();
		Thread.sleep(4000);
String  price =	d.findElement(By.xpath("//div[text()='Apple iPhone X (Space Gray, 256 GB)']/../../div[2]/div[1]")).getText();		
		System.out.println(price);
		
		d.close();
	
	}

}
