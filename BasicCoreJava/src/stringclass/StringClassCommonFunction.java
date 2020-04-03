package stringclass;

public class StringClassCommonFunction {

	public static void main(String[] args) 
	{
	

		String name=" Shweta ";
		System.out.println(name);
		
		// Function 1 - Length
		
		System.out.println(name.length());
		
		// Function 2-Trim
		System.out.println(name.trim().length());
		
		// Function 3 -CharAt
		System.out.println(name.charAt(0));
		
		// Function 4 - toUpperCase
		System.out.println(name.toUpperCase());
		
		// Function 5 -toLowerCase
		System.out.println(name.toLowerCase());
		
		// Function 6 -substring
		System.out.println(name.substring(1));	
		
		// Function 7 - substring
		System.out.println(name.substring(1,6));
		
		// Function 7 - Replace
		System.out.println(name.replace("a","ab"));
		
		// Function -Split
		String[] arr=name.split("a");
		
		for(String s:arr)
		{
			System.out.println(s);
		}
		
		
		// Function 10 -
		System.out.println(name.equals("shweta"));
		System.out.println(name.equalsIgnoreCase("shweta"));
		
		
		
		
	}

}
