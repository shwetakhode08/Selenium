package abstraction;

public class SBI implements RBI {
	
	@Override
	public void savingAccount() {
       System.out.println("Saving Account from SBI");		
	}

	@Override
	public void currentAccount() {
		System.out.println("Current Account from SBI");			
	}

	@Override
	public void debitCard() {
		System.out.println("Debit Account from SBI");			
	}

	@Override
	public void creditCart() {
		System.out.println("Credit Account from SBI");			
	}

}
