import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Campain {

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
		WebElement w6= d.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		w6.click();	
		Thread.sleep(10000);
		WebElement w7= d.findElement(By.name("campaignname"));
		w7.sendKeys("JAN 2018_Banner");
		Thread.sleep(10000);
		
		WebElement w8= d.findElement(By.name("campaigntype"));
		Select sel = new Select(w8);
		
		  sel.selectByVisibleText("Banner Ads");
		WebElement w9= d.findElement(By.xpath("//input[@class='crmButton small save']"));
		w9.click();	
		WebElement w10= d.findElement(By.id("mouseArea_Campaign Type"));
		w10.click();	
		
	System.out.println(w10.getText());
	}

}
