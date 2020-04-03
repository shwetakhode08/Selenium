package abstraction;

public class HDFC implements RBI 
{
 
	//object create in default constructor then to run  default constructor ( e.g. browser)
	 
	@Override
	public void savingAccount() {
       System.out.println("Saving Account from HDFC");		
	}

	@Override
	public void currentAccount() {
		System.out.println("Current Account from HDFC");			
	}

	@Override
	public void debitCard() {
		System.out.println("Debit Account from HDFC");			
	}

	@Override
	public void creditCart() {
		System.out.println("Credit Account from HDFC");			
	}
	
	

}
