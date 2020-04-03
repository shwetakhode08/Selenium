package basicselenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartFlow {

	public static void main(String[] args) throws InterruptedException {

		// go to D:\\Drivers folder & give \  then come some other link then it  D:\\Drivers\\chromedriver.exe copy
	       System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");  
		
		// whever u create obj in class that such class is not their package to import  package
	       ChromeDriver dr=new ChromeDriver(); // default constructor
	       // dr.close();
	       
	       dr.manage().window().maximize();
	       
	       // sychronization   1.Implicit wait
	       
	       dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       
	       dr.get("https://www.flipkart.com/");
	       
	     //button[@class='_2AkmmA _29YdH8']
	       
	       dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	       
	       Actions act= new Actions(dr);  // mouse over
	       act.moveToElement(dr.findElement(By.xpath("//span[text()='Women']"))).build().perform();
	       
	       act.moveToElement(dr.findElement(By.xpath("//span[text()='Men']"))).build().perform();  // not run script error org.openqa.selenium.ElementNotInteractableException
//	       dr.findElement(By.xpath("//a[text()='Shirts1']")).click(); put Shirts1  error  org.openqa.selenium.NoSuchElementException
	       
	       // Explicit waits
	       WebDriverWait wait= new WebDriverWait(dr,10);
	       
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Shirts']")));
	       dr.findElement(By.xpath("//a[text()='Shirts']")).click(); 
	       
	       act.dragAndDropBy(dr.findElement(By.xpath("//div[@class='_3G9WVX oVjMho']/div[@class='_3aQU3C']")), 50, 0).build().perform(); //  X LINE AND Y- LINE -x+x-y+y
	
	       Thread.sleep(2000);
	       dr.findElement(By.xpath("//img[@class='_3togXc']")).click();
	       
//	       dr.findElement(By.xpath("//input[@placeholder='Enter delivery pincode']")).sendKeys("411015");
	
	       String parent=dr.getWindowHandle();  // 1 st window
	       Set<String> wins=dr.getWindowHandles();
	       
           for(String s:wins)
           {
        	   if(!s.equals(parent))
        		   dr.switchTo().window(s);
           }
	       
           dr.findElement(By.xpath("//input[@placeholder='Enter delivery pincode']")).sendKeys("411015");
	     
	  }
	

}
