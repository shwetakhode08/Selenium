package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SecondSelenium {

	public static void main(String[] args) throws InterruptedException {

		  System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");  // go to D:\\Drivers folder & give \  then come some other link then it  D:\\Drivers\\chromedriver.exe copy
			
			// whever u create obj in class that such class is not their package to import  package
		       ChromeDriver dr=new ChromeDriver(); // default constructor
		       // dr.close();
		       
		       dr.manage().window().maximize();
		       
		      // dr.get("http://newtours.demoaut.com/mercuryreservation.php?osCsid=d09c3e6bfc3a297ec42de6b5e4d606ab");
		       //dr.get("http://newtours.demoaut.com/mercuryreservation.php?osCsid=11f06d29fa9d8a058a95df0ac3e723f3");
		       dr.get("http://newtours.demoaut.com/");
		       dr.findElement(By.name("userName")).sendKeys("mercury");
		       dr.findElement(By.name("password")).sendKeys("mercury");
		       dr.findElement(By.name("login")).click();
		       
		       // //tagname[@attributename='Attributvalue']   xpath
		       
		       //Type
		       WebElement tripType=dr.findElement(By.xpath("//input[@value='oneway']"));
		       System.out.println(tripType.isSelected());
		       tripType.click();
		    // System.out.println(tripType.isSelected());  
		       
		       //passenger DropDown
		       WebElement pass=dr.findElement(By.name("passCount")); // ("passCount") - constructor parameter
		       Select sel= new Select(pass);
		       sel.selectByIndex(3);
		       Thread.sleep(2000);
		       sel.selectByValue("2");
		       Thread.sleep(2000);
		       sel.selectByVisibleText("3");
		       
		       //Departing From DropDown
		       WebElement Dcity=dr.findElement(By.name("fromPort")); 
		       Select fp= new Select(Dcity);
		       fp.selectByValue("London");
		       Thread.sleep(2000);
		       //sel.selectByValue("2");
		       //Thread.sleep(2000);
		       //sel.selectByVisibleText("3");
		       		       
		       
		       
	}

}
