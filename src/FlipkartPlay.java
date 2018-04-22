import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartPlay {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		d.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
	WebElement wb =	d.findElement(By.xpath("//a[@title='Electronics']"));
		
		Actions act= new Actions(d);
		act.moveToElement(wb).perform();
		
	 d.findElement(By.xpath("//span[text()='Apple']")).click();
	
	 d.findElement(By.xpath("//p[text()='iPhone']/..")).click();
	///// 
	 
	 List<WebElement> lst = d.findElements(By.xpath("//div[@class='GQtpzo']/div[3]/div[1]/div/div[*]/div/a/div[@class='_1-2Iqu row']/div[1]/div[1]"));
		System.out.println(lst.size());	
	for(int i=0;i<lst.size();i++){
	System.out.println(lst.get(i).getText());
	}

	}
}

