import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Iterators;

public class WindsSwitch {

	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://www.irctc.co.in");
		d.findElement(By.linkText("Flights")).click();;
		Set<String>sel=d.getWindowHandles();
		Iterator<String> s =sel.iterator();
		 String child = s.next();
		 String par =s.next();
		 d.switchTo().window(child);
		 d.findElement(By.xpath(""));
		 
	}

}
