package basicselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ThirdSelenium {

	public static void main(String[] args) {
                // webdriver.chrome.driver already declared
		 System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");  // go to D:\\Drivers folder & give \  then come some other link then it  D:\\Drivers\\chromedriver.exe copy
			
			// whever u create obj in class that such class is not their package to import  package
		       ChromeDriver dr=new ChromeDriver(); // default constructor
		       // dr.close();
		       
		       dr.manage().window().maximize();
		       
		       dr.get("http://newtours.demoaut.com/");
		       dr.findElement(By.name("userName")).sendKeys("mercury");
		       dr.findElement(By.name("password")).sendKeys("mercury");
		       dr.findElement(By.name("login")).click();
		       
		       // dr.get("http://newtours.demoaut.com/mercuryreservation.php?osCsid=14e0a25e5652d1bfd598349448ff7fbe");
		       dr.findElement(By.name("findFlights")).click();
		       
		       
		       // //tagname[@attributename='Attributvalue']
		       
		       WebElement text=dr.findElementByXPath("//font[@face='Arial, Helvetica, sans-serif'][@size='2']");
		       
		       System.out.println(text.getText());
		       
		       // continue button
		       dr.findElement(By.name("reserveFlights")).click();
		      
		       dr.findElement(By.name("ticketLess")).click();
		       
		       // Same as Billing Address 
		       dr.findElementByXPath("(//input[@name='ticketLess'])[2]").click();
		       
		       WebElement country=dr.findElement(By.name("delCountry")); 
		       Select sel= new Select(country);
		       
		       sel.selectByVisibleText("INDIA");
		       
		       Alert alt=dr.switchTo().alert();  // check return type
		       
		       System.out.println(alt.getText());
		       alt.dismiss();  // alt.accept();
		       
		       
		       
	}

}
