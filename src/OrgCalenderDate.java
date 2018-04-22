import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrgCalenderDate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.get("http://localhost:8888/");
		
		
		d.findElement(By.name("user_name")).sendKeys("admin");
		d.findElement(By.name("user_password")).sendKeys("tiger");
		d.findElement(By.id("submitButton")).click();	
		Thread.sleep(1000);
		d.findElement(By.xpath("//a[text()='Contacts']")).click();
		Thread.sleep(10000);
		d.findElement(By.xpath("//img[@title='Create Contact...']")).click();
        Thread.sleep(1000);
        d.findElement(By.id("jscal_trigger_birthday")).click();
        
Thread.sleep(10000);

while(true){
	try{
		d.findElement(By.xpath("//td[2][text()='November, 1995']/../../../tbody/tr[5]/td[2][text()='26']")).click();
		
		break;
	}
	catch(Throwable t){
		d.findElement(By.xpath("//td[text()='‹']")).click();
		
	}
	
}







}

        		
	}
                    //td[2][text()='November, 1995']/../../../tbody/tr[5]/td[2][text()='26']
        
	//table[@class='settingsSelectedUI']/following-sibling::div[3]/table/thead/tr[2]/td[2]


//table[@class='settingsSelectedUI']/following-sibling::div[3]/table/tbody/tr[5]/td[2][text()='26']




