package pages;

import org.openqa.selenium.WebDriver;

public class PageInterface {
	
	public HomePage homePage;
	public FlightFinder flightFinder;
	public PageInterface(WebDriver dr)
	{
		homePage= new HomePage(dr);
	    flightFinder= new FlightFinder(dr);		
	  //Add objects of other pages as well
	}
	
	
	
	

}
