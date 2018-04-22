import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

public class ListOrg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d =new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.navigate().to("http://localhost:8888/");
		
	            d.findElement(By.name("user_name")).sendKeys("admin");
	       	d.findElement(By.name("user_password")).sendKeys("tiger");
                    d.findElement(By.id("submitButton")).click();	
                    d.findElement(By.partialLinkText("Organization")).click();
                while(true){
                	List<WebElement> lst =d.findElements(By.xpath("//table[@class='lvt small']/tbody/tr/td[3]/a"));
            		for(int i=0;i<lst.size();i++){
            			System.out.println(lst.get(i).getText());
            		}
                	try{   
                		d.findElement(By.xpath("//a[@title='Next']/img")).click();
                		Thread.sleep(5000);
                	}                	
           
                	catch(Throwable t){
                		
                		
                		break;
                	}
               
                }
	}
}
                
                    

