package conditionalstatement;

public class ifelsestatement {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		//1.>
		if(a>b)
		{
			System.out.println("a is greater than b");
		}else {
			System.out.println("a is less than b");
		}
		
	
	//2.<
	if(a<b)
	{
		System.out.println("a is less than b");
	}else {
		System.out.println("a is greater than b");
	}
	
	    //3.>=
		if(a>=b)
		{
			System.out.println("a is greater than or  equal to b");
		}else {
			System.out.println("a is less than or  equal to b");
		}
		
	//4.<=
		if(a<=b)
		{
			System.out.println("a is less than or  equal to b");
		}else {
			System.out.println("a is greater than or  equal to b");
		}
	
	
		//5.==
				if(a==b)
				{
					System.out.println("a is equal to or  equal to b");
				}else {
					System.out.println("a is not equal to or  equal to b");
				}
		//6.!=
		if(a!=b)
		{
			System.out.println("a is not equal to b");
		}else {
			System.out.println("a is equal to b");
		}
	
	}
}

