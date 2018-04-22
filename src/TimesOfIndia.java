import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TimesOfIndia {
@Test
public static void TimesOfIndiaTest(){
	WebDriver d =new FirefoxDriver();
	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	d.navigate().to("https://timesofindia.indiatimes.com/");
	java.util.List<WebElement> topnews=d.findElements(By.xpath("//div[@class='top-story']/ul/li[*]"));
	topnews.size();
	for(int i=0; i<topnews.size(); i++){
		String list =topnews.get(i).getText();
		System.out.println(list);
		
	}
	
	
	
	
}
}
