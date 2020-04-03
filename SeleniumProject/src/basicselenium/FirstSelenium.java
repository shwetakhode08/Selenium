package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	public static void main(String[] args) 
   {
		// go to D:\\Drivers folder & give \  then come some other link then it  D:\\Drivers\\chromedriver.exe copy
       System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");  
	
	// whever u create obj in class that such class is not their package to import  package
        
        ChromeDriver dr=new ChromeDriver(); // default constructor
       // dr.close();
       
       dr.manage().window().maximize();
       
       dr.get("http://newtours.demoaut.com/");
       dr.findElement(By.name("userName")).sendKeys("mercury");
       dr.findElement(By.name("password")).sendKeys("mercury");
       dr.findElement(By.name("login")).click();
      
	}

}
