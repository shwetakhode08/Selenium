package exceptionalhandle;

public class ThrowAndThrowKeyword {

	private static char[] temp;

	public static void main(String[] args) {
		sum(10,20);
		temp();
		 
		try {
			pause(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	//  use throw

	public static void pause(long miliSeconds) throws InterruptedException 
	{
		Thread.sleep(miliSeconds);
	}
	
	// not use throw
	
	public static void sum(int a, int b) // throws ArithmaticException
	{
		System.out.println(a+b);
	}
	
   public static void temp()     //	 throws ArithmaticException
	{
		
		System.out.println(temp);
	}
	
}
