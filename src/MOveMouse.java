import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MOveMouse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d =new FirefoxDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		WebElement shop = d.findElement(By.id("nav-link-shopall"));
		Actions a = new Actions((d));
		a.moveToElement(shop).perform();
		Thread.sleep(2000);
	   WebElement mob =	d.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		a.moveToElement(mob).perform();
		Thread.sleep(2000);
		d.findElement(By.xpath("//span[text()='All Mobile Phones']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[text()='OnePlus 5T']")).click();	
	}

}
