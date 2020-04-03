package abstraction;

public class ICICI implements RBI 
{
	
	@Override
	public void savingAccount() {
       System.out.println("Saving Account from ICICI");		
	}

	@Override
	public void currentAccount() {
		System.out.println("Current Account from ICICI");			
	}

	@Override
	public void debitCard() {
		System.out.println("Debit Account from ICICI");			
	}

	@Override
	public void creditCart() {
		System.out.println("Credit Account from ICICI");			
	}

}
