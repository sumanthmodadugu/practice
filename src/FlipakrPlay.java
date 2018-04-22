import java.awt.List;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class FlipakrPlay {
@Test
public void action(){
	//System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
	
	WebDriver driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	WebElement  elc = driver.findElement(By.xpath("//span[text()='Electronics']"));
	Actions act = new Actions(driver);
	act.moveToElement(elc).perform();
	
	WebDriverWait wait =new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Mi']"))).click();
	
	java.util.List<WebElement> lst = driver.findElements(By.xpath("//div[@class='GQtpzo']/div[3]/div[1]/div/div[*]/div/a/div[@class='_1-2Iqu row']/div[1]/div[1]"));
	System.out.println(lst.size());
       for(int i=0;i<lst.size();i++){
    	   System.out.println(lst.get(i).getText());
       }
       
	
	}
	
	
}
