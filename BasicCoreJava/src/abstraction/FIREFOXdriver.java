package abstraction;

public class FIREFOXdriver implements Webdriver 
{
	
	 
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
