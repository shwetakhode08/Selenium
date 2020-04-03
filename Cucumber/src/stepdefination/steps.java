package stepdefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps {
	
	 WebDriver dr;
	
	@Given("^Application is up and running$")
	public void application_is_up_and_running()  
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");  
		
		ChromeDriver dr=new ChromeDriver(); 
	    dr.manage().window().maximize();
	    //dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       
	    //dr.get("https://opensource-demo.orangehrmlive.com/");
	    dr.get("http://newtours.demoaut.com/");
	}

	@When("^I enter username and password$")
	public void i_enter_username_and_password() 
    {
		  
//          dr.findElement(By.name("userName")).sendKeys("mercury");
//	      dr.findElement(By.name("password")).sendKeys("mercury");
//	      dr.findElement(By.name("login")).click();
		dr.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
	    dr.findElement(By.xpath("//input[@name='txtPassword'")).sendKeys("admin123");
	    dr.findElement(By.xpath("//input[@name='Submit']")).click();
		
	}

	@Then("^I should be logged in to the application$")
	public void i_should_be_logged_in_to_the_application() 
	{
		// Assert.assertEquals("MERCURY", dr.getTitle());
		Assert.assertEquals("OrangeHRM", dr.getTitle());
		
	
	}
	
	 @When("^I enter valid (.*?) and (.*?)$")
	 public void enterCredentials(String username, String password)
	
	 {
//		  dr.findElement(By.name("userName")).sendKeys("mercury");
//	      dr.findElement(By.name("password")).sendKeys("mercury");
//	      dr.findElement(By.name("login")).click();
		 
		    dr.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
		    dr.findElement(By.xpath("//input[@name='txtPassword'")).sendKeys("admin123");
		    dr.findElement(By.xpath("//input[@name='Submit']")).click();
		 
	 }

}
