import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Exoprt {

	public static void main(String[] args) {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/csv");
		profile.setPreference("browser.download.folderList", 0);
		WebDriver d = new FirefoxDriver(profile);
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("http://localhost:8888/");
		
		
		d.findElement(By.name("user_name")).sendKeys("admin");
		d.findElement(By.name("user_password")).sendKeys("tiger");
		d.findElement(By.id("submitButton")).click();	
		d.findElement(By.xpath("//a[text()='Organizations']")).click();
		d.findElement(By.xpath("//img[@src='themes/softed/images/tbarExport.gif']")).click();
		d.findElement(By.xpath("//input[@class='crmbutton small create']")).click();
		
	}

}
