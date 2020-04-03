package constructors;

public class Car 
{

	// instance variable
	String color;
	String brand;
	String type;
	static int wheels=4;
	
	
	public void features()
	{
		System.out.println("I purchased "+color+" "+brand+" car which has "+type+" engine and has "+wheels+ " wheeels");
	}
	
	//  instance variables
	// default constructor  CLASS NAME car name
	
	public Car()
	{
		
	}
	
	// Parameterized constructors (constructor over loading method ) local variable and this keyword always call instance varible
	
	
	public Car(String color, String brand, String type)
	{
		this.color=color;
		this.brand=brand;
		this.type=type;
		
	}
}
