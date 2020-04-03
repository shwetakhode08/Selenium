package abstraction;

public class CHROMEdriver implements Webdriver 
{
 
	//object create in default constructor then to run  default constructor ( e.g. browser)
	 
	@Override
	public void GET() {
       System.out.println("nevigate to URL");		
	}

	@Override
	public void SENDKEY() {
		System.out.println("Enter username password");			
	}

	@Override
	public void GETFL() {
		System.out.println("verify page");			
	}

	@Override
	public void CLOSE() {
		System.out.println("close browser");			
	}
	
	

}
