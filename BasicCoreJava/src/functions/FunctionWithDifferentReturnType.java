package functions;

public class FunctionWithDifferentReturnType {

	
	// change void to return (return value)
	
	public static void main(String[] args) {

		int temp=0;
		System.out.println(temp);
		temp=sum(10,20);
		System.out.println(temp);
	}
	
	public static int sum(int x,int y)
	{
		return x+y;
	
	}

}
