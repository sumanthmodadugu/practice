import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("search_query_top")).sendKeys("printed summer Dress");
		driver.findElement(By.name("submit_search")).submit();
	WebElement header =	driver.findElement(By.xpath("//span[@class='heading-counter']"));	
		System.out.println(header.getText());
		driver.close();
}
}

