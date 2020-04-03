package exceptionalhandle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Ref;

import constructors.Car;
import inheritance.Smartphone;

public class ExceptionalTypes {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException 
	{

		int a=10;
		int b=0;
		
		
         //  Example 1- ArithmaticExeption
		// System.out.println(a/b);  run time output
		
	//  Example 2- StringIndexOutOfBoundsException
		String name="shweta";
//		System.out.println(name.charAt(7));
		
	//  Example 3- ArrayIndexOutOfBoundsException
		
		String[]  arr=name.split("w");
		// System.out.println(arr[4]);
		
		//  Example 4 - NullPointerException
		
  		Smartphone phone=null;
//		phone.calling();
		
//		Car car1=null;
//		car1.features();
  		
  		//  Example 5  -InterruptedException
  		
  		System.out.println("shweta");
  		Thread.sleep(5000);
  		System.out.println("Techbodhi");
  		
  		FileInputStream file= new FileInputStream("");
  		
  		//  Example 6 - FileNotFoundException
  		
  		// CHECKED EXCEPTIONS  .E.G. 5 & 6  
  	// UNCHECKED EXCEPTIONS  .E.G. 1--4 
  		
  		
  		
  		
	}

}
