package swichtowindow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class acttion {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");  
		
		
        
	       driver=new ChromeDriver(); 
	    
	       
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	      driver.get("https://www.facebook.com/");
	      driver.manage().window().maximize();
	      
	      // get the reference for web element email
	      WebElement userName = driver.findElement(By.id("email"));
	      
	      
	      // Mouse over on 'WOMEN Link'
	      Actions act = new Actions(driver); 
	      Action seriesOfAction=act.moveToElement(userName).click().keyDown(userName,Keys.SHIFT).sendKeys(userName,"hello").keyUp(userName,Keys.SHIFT).doubleClick(userName).contextClick().sendKeys(Keys.ENTER).build();
	      seriesOfAction.perform();
	      Thread.sleep(5000);
	      
	      driver.close();
	     
	    		  

}
}
