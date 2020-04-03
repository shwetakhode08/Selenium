package exceptionalhandle;

import inheritance.Smartphone;

public class ExceptionHandling2 {

	public static void main(String[] args) {

		int a=10;
		int b=10;
		
		
		// multiple catch block
		
		 try {
          //  Example 1- ArithmaticExeption  -----run time output
		   System.out.println(a/b); 
		 
		 
	
		
	//  Example 2- StringIndexOutOfBoundsException
		String name="shweta";
		System.out.println(name.charAt(2));
		
		
	//  Example 3- ArrayIndexOutOfBoundsException
		
			String[]  arr=name.split("w");
		   System.out.println(arr[4]);
			
			//  Example 4 - NullPointerException
			
	  		Smartphone phone=null;
         	phone.calling();
			
	  		
		 }catch(StringIndexOutOfBoundsException e)
		 {
			 System.out.println(e.getMessage());
		 }catch(ArithmeticException e)
		 {
			 System.out.println(e.getMessage());
		 }catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println(e.getMessage());
		 }catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }
	}

}
