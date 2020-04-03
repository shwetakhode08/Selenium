package samplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstMavenClass 
{
	@Test
	public void test1()
	{
		System.out.println("Testing Maven class");
	}
	
	@Test
	public void test2()
	
	{

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
