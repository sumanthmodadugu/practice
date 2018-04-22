import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d =new FirefoxDriver();
		d.get("http://localhost:8888/");
		
		
		d.findElement(By.name("user_name")).sendKeys("admin");
		d.findElement(By.name("user_password")).sendKeys("tiger");
		d.findElement(By.id("submitButton")).click();	
		Thread.sleep(10000);
		d.findElement(By.xpath("//a[text()='Organizations']")).click();
		Thread.sleep(10000);
		d.findElement(By.xpath("//img[@title='Create Organization...']")).click();
        Thread.sleep(10000);
        d.findElement(By.xpath("//input[@name='accountname']")).sendKeys("sumanth0j00");
        d.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
	           Set<String>set = d.getWindowHandles();
	Iterator<String> it = set.iterator();
	String  parentWinID = it.next();
	String  childWinID =  it.next();
	Thread.sleep(20000);
	d.switchTo().window(childWinID);
	d.findElement(By.xpath("//a[text()='take me']")).click();
	d.switchTo().window(parentWinID);
	d.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	}
}
