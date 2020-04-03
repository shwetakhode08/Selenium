package basicselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIFrame {

	public static void main(String[] args) throws InterruptedException {

		// go to D:\\Drivers folder & give \  then come some other link then it  D:\\Drivers\\chromedriver.exe copy
	       System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");  
		
		// whever u create obj in class that such class is not their package to import  package
	       ChromeDriver dr=new ChromeDriver(); // default constructor
	       // dr.close();
	       
	       dr.manage().window().maximize();
	       dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       
	       dr.get("https://paytm.com/");
	       Thread.sleep(5000);
	       
	       dr.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
	       
	       // //span[text()='Login/Signup with mobile number and password']
	       
	       
	       Thread.sleep(3000);
//	       dr.switchTo().frame(0);
	       
	       dr.switchTo().frame(dr.findElement(By.tagName("iframe")));
	       
	       dr.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
	}

}
