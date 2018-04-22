import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class practice2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	Boolean imageLoaded = driver.findElement(By.id("header_logo")).isDisplayed();
	
		//verify  Logo is displayed or Not
		
	if (imageLoaded) {
		System.out.println("Logo displayed.");
		} 

		else {
		System.out.println("Logo not displayed.");
		}
}
}

