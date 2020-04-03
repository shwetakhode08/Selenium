package abstraction;

public class BankUser {

	public static void main(String[] args) {
		
		
//		1.launch browser - OBJECT
//		2.nevigate to URL - GET - SAVING ACCOUNT
//		3.Enter username password - SENDKEY -CURRRENT ACCOUNT
//		4.verify - GETFL  - CREDIT CARD
//		5.close browser -CLOSE - DEBIT CARD
//
//
//		RBI- webdriver
//		HDFC-CHROME DR.
//		ICICI - FIREFOX DR.
//		SBI-EDGE DR.
		

		RBI ref=null;
		
//		String bankName="HDFC";
	   String bankName="SBI";
//	 String bankName="ICICI";
		
		if(bankName.equals("HDFC"))
		
		ref=new HDFC();
		else if(bankName.equals("SBI"))
		ref=new SBI();
		else if(bankName.equals("ICICI"))	
			ref=new ICICI();	
			
			
			
	    ref.creditCart();
		ref.debitCard();
		ref.currentAccount();
		ref.savingAccount();
		
		
		ref.demonetisation();
//		ref.c
		
		
//		
//		ref=new ICICI();
//	    ref.creditCart();
//		ref.debitCard();
//		ref.currentAccount();
//		ref.savingAccount();
//		
//		
//		ref=new SBI();
//	    ref.creditCart();
//		ref.debitCard();
//		ref.currentAccount();
//		ref.savingAccount();
		
	}

}
