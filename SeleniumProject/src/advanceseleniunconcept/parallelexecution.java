package advanceseleniunconcept;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelexecution {
	
	@Test
	public void test1()
	{
		  System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");  
			
			
	        
	        ChromeDriver dr=new ChromeDriver(); // default constructor
	    
	       
	       dr.manage().window().maximize();
	       
	       dr.get("https://www.w3schools.com/html/html_tables.asp");
	}
	

}
