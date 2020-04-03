import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");  
		
		
        
	       driver=new ChromeDriver(); 
	    
	       
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	      driver.get("http://demo.guru99.com/test/guru99home/");
	      driver.manage().window().maximize();
	      
	      driver.switchTo().frame("a077aa5e");
	      System.out.println("*********We are switch to iframe***********");
	      Thread.sleep(2000);
	      
	      driver.findElement(By.xpath("html/body/a/img")).click();
	      // driver.switchTo().defaultContent(); // come original window for small iframe window
	      // driver.switchTo.frame("");
	      
	}

}
