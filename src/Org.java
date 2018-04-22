import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Org {
	 
@Test
	public static void Comptest() throws Throwable  {
		WebDriver d =new FirefoxDriver();
	
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.navigate().to("http://localhost:8888/");
		
		EventFiringWebDriver err =new EventFiringWebDriver(d);
	File scrf = err.getScreenshotAs(OutputType.FILE);
	File dcsf =new File("‪C:\\Users\\Manu\\Desktop\\Screenshot");
        try {
			FileUtils.copyFile(scrf, dcsf);
		} catch (IOException e) {
		}
	            d.findElement(By.name("user_name")).sendKeys("admin");
	       	d.findElement(By.name("user_password")).sendKeys("tiger");
                    d.findElement(By.id("submitButton")).click();	
                    d.findElement(By.partialLinkText("Contacts")).click();
                    d.findElement(By.xpath("//img[@title='Create Contact...']")).click();                    
                      d.findElement(By.name("lastname")).sendKeys("sumanth");
                       d.findElement(By.name("imagename")).click();
                  
                      StringSelection path =new StringSelection("galaxy-scene.jpg");
                      Toolkit   tool = Toolkit.getDefaultToolkit();
                      Clipboard mouse =tool.getSystemClipboard();
                      mouse.setContents(path, null);
                      Robot r =new Robot();
                      Thread.sleep(4000);
                             r.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
                    		 r.keyPress(java.awt.event.KeyEvent.VK_V);
                    		 r.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
                    		 r.keyRelease(java.awt.event.KeyEvent.VK_V);
                    		 
                    		 r.keyPress(java.awt.event.KeyEvent.VK_ENTER);
                    		 r.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
                    		
                    		  
                              d.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
                              Reporter.log("CONTACT CREATED SUCESSFULLY");
                  
                      	 String act = d.findElement(By.id("dtlview_Last Name")).getText();
                       
                             String   exp ="sumanth";
                              Assert.assertEquals(act, exp);
                              
                            WebElement img =  d.findElement(By.xpath("//img[@title='Contact Image']"));
                            	Boolean s =	img.isDisplayed();
                       Assert.assertTrue(s);
                    		  
                    		  
     d.close();               
	}

}
