package advanceseleniunconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");  
		
		// whever u create obj in class that such class is not their package to import  package
	        
	        ChromeDriver dr=new ChromeDriver(); // default constructor
	       // dr.close();
	       
	       dr.manage().window().maximize();
	       
	       dr.get("https://www.w3schools.com/html/html_tables.asp");
	       int rows = dr.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
	       
	       for(int r=1; r<=rows; r++)
	       {
	    	  //  int cols=dr.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();
	    	   int cols=dr.findElements(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td")).size();
	    	   
	    	   for(int c=1; c<=cols; c++)
	    	   {
	    		   String text=dr.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td["+c+"]")).getText();
	    		   System.out.println(text+"");
	    	   }
	    	   System.out.println();
	       }
	       
	      
	}

}
