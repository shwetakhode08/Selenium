package abstraction;

public class WebdriverUser {

	public static void main(String[] args) {
		
		
//		1.launch browser - OBJECT
//		2.nevigate to URL - GET - SAVING ACCOUNT
//		3.Enter username password - SENDKEY -CURRRENT ACCOUNT
//		4.verify - GETFL  - CREDIT CARD
//		5.close browser -CLOSE - DEBIT CARD
//
//
////	
//		RBI- Webdriver
//		HDFC-CHROME driver
//		ICICI - FIREFOX driver
//		SBI-EDGE driver
		

		Webdriver ref=null;
		
//		String WebdriverName="EDGEdriver";
	   String WebdriverName="CHROMEdriver";
//	 String WebdriverName="FIREFOXdriver";
		
		if(WebdriverName.equals("CHROMEdriver"))
		
		ref=new CHROMEdriver();
		else if(WebdriverName.equals("FIREFOXdriver"))
		ref=new FIREFOXdriver();
		else if(WebdriverName.equals("EDGEdriver"))	
			ref=new EDGEdriver();	
			
			
			
	    ref.GET();
		ref.SENDKEY();
		ref.GETFL();
		ref.CLOSE();
		
		
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
