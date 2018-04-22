import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Vodafone {

	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver d =new FirefoxDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.vodafone.in/home-mumbai");
		d.findElement(By.xpath("//a[@onclick='closeClick();']")).click();
		d.findElement(By.xpath("//div[@class='owl-shopOnline owl-carousel owl-theme owl-loaded']/div[1]/div/div[3]/div/a")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[@class='vodafoneIncludecta']/div[1]/a")).click();
		Thread.sleep(1000);
		d.findElement(By.id("fName")).sendKeys("sumanth");
		d.findElement(By.id("contact")).sendKeys("9535159960");
		d.findElement(By.xpath("//a[text()='Submit']")).click();;
	String err = d.findElement(By.id("nvfCaptchaErr")).getText();
	System.out.println(err);
	d.close();
	}
}

