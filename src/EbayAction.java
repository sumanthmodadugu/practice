import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class EbayAction {

	public static void main(String[] args) {
		WebDriver d =new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.navigate().to("https://www.ebay.in/");
		WebElement list = d.findElement(By.xpath("//tr[@role='list']/td[*]/a[text()='Deals']"));
		Actions act = new Actions(d);
		act.moveToElement(list).perform();
		d.findElement(By.xpath("//tr[@role='list']/td[*]/descendant::a[@title='Deals - Mobile Phones']")).click();
		
	}

}




//tr[@role='list']/td[*]/descendant::a[text()='Mobile Phones']