package keyboardmouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class key {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");  
		
		
        
	       driver=new ChromeDriver(); 
	    
	       
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	      driver.get("https://www.myntra.com/");
	      driver.manage().window().maximize();
	      
	      // Mouse over on 'WOMEN Link'
	      Actions act = new Actions(driver);  
	      
	      WebElement test = driver.findElement(By.linkText("WOMEN"));
	      act.moveToElement(test).build().perform();
	      
	      Thread.sleep(5000);	      
	      // click on Kurtas & Suits link
	      driver.findElement(By.linkText("Kurtas & Suits"));
	      

		
	}

}
