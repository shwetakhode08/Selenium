package basicselenium;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) 
	{
		// go to D:\\Drivers folder & give \  then come some other link then it  D:\\Drivers\\chromedriver.exe copy
	       System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");  
		
		// whever u create obj in class that such class is not their package to import  package
	       ChromeDriver dr=new ChromeDriver(); // default constructor
	       // dr.close();
	       
	       dr.manage().window().maximize();
	       
	       dr.get("https://www.naukri.com/");
	       String parent=dr.getWindowHandle();
	       Set<String> wins=dr.getWindowHandles();   
	       
	       // AGS Health
	       
	       for(String s:wins)
           {
	    	   dr.switchTo().window(s);
        	   if(dr.getTitle().equals("AGS Health"))
        	   {
        	dr.close();   
        	   }
           }
	}

}
