package swichtowindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlewindow {
	public static WebDriver driver;

	public static void main(String[] args) {

		
	       System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");  
		
	
	        
	       driver=new ChromeDriver(); 
	    
	       
	      driver.manage().window().maximize();
	       
	     driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
	     String Store = driver.getWindowHandle();
	     
	       driver.findElement(By.xpath("//button[@id='win1']")).click();
	       
	       Set<String> handle=driver.getWindowHandles();
	       
	       for(String abc:handle)
	       {
	    	   driver.switchTo().window(abc);
	    	   
	       }
	       
	    	   driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("shweta khode");
	    	   driver.switchTo().window(Store);
	    	   driver.findElement(By.xpath("//input[@id='novels-radio-btn']")).click();
	    	   
	    	     
	       }
	       
	}


