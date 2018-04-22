import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Irctc {
	
	@Test
	
	public void IrctcWiondowTest() throws Throwable{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://www.irctc.co.in");
		//driver.findElement(By.partialLinkText("Flights")).click();
		
		 
		/*Set<String> seld =  driver.getWindowHandles();
		Iterator<String> ls =seld.iterator();
		String kiki = ls.next();
		 String chiku =ls.next();
		 driver.switchTo().window(chiku);
		 Thread.sleep(40000);
	driver.findElement(By.id("from")).sendKeys("bangalore");
	
	driver.switchTo().window(kiki);*/
	Actions act=new Actions(driver);
	
	WebElement tro = driver.findElement(By.partialLinkText("Tourism"));
	act.moveToElement(tro).perform();
	WebElement acc =driver.findElement(By.partialLinkText("Accommodations"));
	act.moveToElement(acc).perform();
	WebElement hot =driver.findElement(By.partialLinkText("Hotels & Lounge"));
	act.moveToElement(hot).perform();
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
	}

}
