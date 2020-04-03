package conditionalstatement;

public class IfElsestatement2 
{

	public static void main(String[] args) 
	{
		int a=10; //20    10
		int b=20; //20    10
		
		if(a>b)
		{ 
			System.out.println("a is greater than b");
		}else if (a==b) 
		{
			System.out.println("a is equal to b");
		}
		
		System.out.println("program run 1");
		
		add(a,b);
		sub(a,b);
	}

	public static void add(int a, int b) 
	{
//		int a=10; //20    10
//		int b=20; //20    10
		int c = a+b;
		System.out.println("A+B="+c);
	}
	
	public static void sub(int a, int b) 
	{
//		int a=10; //20    10
//		int b=20; //20    10
		int c = a-b;
		System.out.println("A-B="+c);
	}
}