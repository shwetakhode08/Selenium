package polymorphism;

public class FunctionClass1 {

	public static void main(String[] args) {
		
   // Functional calling
		
		// polymorphism  overloading
		
		sum();
		sum(10,20);
		sum(20,30);
		sum(30,40);
		sum(10,20,30);
		
	 
		
		
		
		
		
		// to call other
		String[] arr=ReturnAssignment.names();
		  for(int i=0; i<arr.length; i++)
	        {
	        System.out.println(arr[i]);
	        }
		
		// to print
		System.out.println(ReturnAssignment.stds);
	}
    public static void sum()
    {
    	int a=10;
		int b=20;
		
		System.out.println(a+b);
    }
    
    public static void sum(int a, int b)
    {
    	System.out.println(a+b);
    }
    
}
