package exceptionalhandle;

public class ExceptionHandling {

	public static void main(String[] args) 
	
	{

		int a=10;
		int b=0;
		
		 try {
          //  Example 1- ArithmaticExeption  -----run time output
		   System.out.println(a/b); 
		 }catch(ArithmeticException e)
		 {
			 System.out.println(e.getMessage());
		 }
		 
		 
		 try {
	//  Example 2- StringIndexOutOfBoundsException
		String name="shweta";
		System.out.println(name.charAt(7));
		 }catch(StringIndexOutOfBoundsException e)
		 {
			 System.out.println(e.getMessage());
		 }
	}

}
