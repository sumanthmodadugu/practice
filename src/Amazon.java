import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new FirefoxDriver();
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(2000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone",Keys.ENTER);
         String result = driver.findElement(By.id("s-result-count")).getText();
                   System.out.println(result);	
		
		
		
		
	}

}
