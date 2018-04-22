import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Searchfile {


		public static void main(String[] args) throws InterruptedException {
			WebDriver d =new FirefoxDriver();
			d.get("http://localhost:8888/");
			WebElement w= d.findElement(By.name("user_name"));
			w.sendKeys("admin");
			WebElement w1= d.findElement(By.name("user_password"));
			w1.sendKeys("tiger");
			WebElement w3= d.findElement(By.id("submitButton"));
			w3.click();	
			Thread.sleep(10000);
			WebElement w4= d.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']"));
			w4.click();	
			Thread.sleep(4000);
			WebElement w5= d.findElement(By.name("Campaigns"));
			w5.click();	
			Thread.sleep(10000);
			WebElement w6 = d.findElement(By.name("search_text"));
			w6.sendKeys("Banner");
			
		
			
			WebElement w7= d.findElement(By.id("bas_searchfield"));
			
			Select sel = new Select(w7);
			sel.selectByVisibleText("Campaign Type");
			List<WebElement> lst = sel.getOptions();
			System.out.println(lst.size());
			WebElement w8= d.findElement(By.name("submit"));
			w8.click();	
			WebElement w9= d.findElement(By.linkText("JAN 2018_Banner"));
			w9.click();
			
			
			
			
	}

}
