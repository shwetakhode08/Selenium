package basicselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email {
	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");  // go to D:\\Drivers folder & give \  then come some other link then it  D:\\Drivers\\chromedriver.exe copy
			
			// whever u create obj in class that such class is not their package to import  package
		       ChromeDriver dr=new ChromeDriver(); // default constructor
		       // dr.close();
		       
		       dr.manage().window().maximize();
		       
		      dr.get("https://mail.google.com/");
		      dr.findElement(By.id("identifierId")).sendKeys("shwetakhode08");
		      dr.findElement(By.className("CwaK9")).click();
//		      dr.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
     	      dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     	      dr.findElement(By.name("password")).sendKeys("shweta@1988");
     	      dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     	      dr.findElement(By.className("CwaK9")).click();
     	      
//		      dr.findElement(By.xpath("//*[@id=\"passwordNext\"]/span")).click();
   //  	      dr.findElement(By.className("T-I J-J5-Ji T-I-KE L3")).click();
            //  dr.findElement(By.xpath("/div[@class='z0']/div")).click();      
     	     
     	     
     	     
		      
		  
		     // dr.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("shweta@1988");
//		       dr.get("http://newtours.demoaut.com/");
//	       dr.findElement(By.name("userName")).sendKeys("shwetakhode08@gmail.com");
//	       dr.findElement(By.name("password")).sendKeys("shweta@1988");
//	       dr.findElement(By.name("login")).click();
	}

}
