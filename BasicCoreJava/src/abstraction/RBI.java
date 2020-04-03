package abstraction;

public interface RBI extends Modi, SC   // multiple inheritance it is possible in inherence
{
	
	// can not create object in interface and not use instance
	
	public void savingAccount(); // { } is not present but don't show error in Interface
	public void currentAccount();
	public void debitCard();
	public void creditCart();

}
