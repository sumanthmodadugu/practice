import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windsplay {
	
	
	public static void main(String[] args){
		
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://timesofindia.indiatimes.com/");
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		java.util.List<WebElement> lst = d.findElements(By.xpath("//div[@class='top-story']/ul/li[*]"));
		lst.size();
		for(int i=0;i<lst.size();i++){
			System.out.println(lst.get(i).getText());
		}
		
	}

}
