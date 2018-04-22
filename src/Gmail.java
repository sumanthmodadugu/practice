import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d =new FirefoxDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.google.com/gmail/about/");
		Thread.sleep(3000);
		d.findElement(By.xpath("//a[text()='Sign In']")).click();
		Thread.sleep(2000);
		d.findElement(By.id("identifierId")).sendKeys("jyothikonuri2017",Keys.ENTER);
		Thread.sleep(10000);
		d.findElement(By.name("password")).sendKeys("vijaya9502<3",Keys.ENTER);
		Thread.sleep(10000);
	String gb =	d.findElement(By.xpath("//div[@id=':iv']/div/div/div[1]/span[1]")).getText();
	System.out.println(gb.substring(0, gb.length()-2));
	
	String kb = gb.substring(0, gb.length()-2);
	
	Double i =Double.parseDouble(kb);
	Double inkb = i*1000000;
	System.out.println("used memeory in KB   ="+ inkb);
	}

}
