package advanceseleniunconcept;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class capturescreenshot {

	public static void main(String[] args) throws IOException {

		
	       System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");  
		
		
	        
	        ChromeDriver dr=new ChromeDriver(); // default constructor
	    
	       
	       dr.manage().window().maximize();
	       
	       dr.get("https://www.w3schools.com/html/html_tables.asp");
	       
	       TakesScreenshot scrShot=(TakesScreenshot)dr;
	       
	       // call get screen shot method to create image file
	       File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	       
	       File dest=new File(("D://shwp.jpg"));
	       FileHandler.copy(SrcFile, dest);
	       
	}

}
