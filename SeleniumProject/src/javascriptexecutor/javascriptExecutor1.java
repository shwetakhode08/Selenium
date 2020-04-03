package javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutor1 {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");  
		
		driver=new ChromeDriver();
        
		JavascriptExecutor js=(JavascriptExecutor)driver; 
	    
	       
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	      driver.get("http://demo.guru99.com/test/guru99home/V4/");
	      
	    //  js.executeScript("alert('Welcome to Guru99');");
	      
	      WebElement button = driver.findElement(By.name("btnLogin"));
	      
	      // login to guru
	      
	      driver.findElement(By.name("uid")).sendKeys("mngr34926");
	      driver.findElement(By.name("password")).sendKeys("amUpenu");
	      
	      // perform click on login button using javascriptExecutor
	      
	      
	      js.executeScript("argurments[0].click();",button);
	      
	      driver.close();
	      
	      

	
	}

	
}

