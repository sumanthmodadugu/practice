import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d =new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.navigate().to("https://www.cleartrip.com/");
		d.findElement(By.id("FromTag")).sendKeys("Bangalore, IN - Kempegowda International Airport (BLR)");
		d.findElement(By.id("ToTag")).sendKeys("New Delhi, IN - Indira Gandhi Airport (DEL)");
		d.findElement(By.xpath("//input[@id='DepartDate']/../a/i[text()='Cal']")).click();
		while(true){
			try{
	d.findElement(By.xpath("//div[@class='monthBlock first']/div/div[@class='title']/span[text()='April']/../../../table/tbody/tr/td/a[text()='24']")).click();
	break;
			}
			catch (Throwable t){
				
				d.findElement(By.xpath("//div[@id='ui-datepicker-div']/descendant::a[@title='Next']")).click();
				
			}
			
		}
		
		

	}

}
