package arrays;

public class ArrayJava {

	public static void main(String[] args) {
		
		String[] std=new String[11];
		
		System.out.println(std.length);
		
		std[0]="Shweta";
		std[1]="Ashrita";
		std[2]="Rajeshree";
		std[3]="Amrita";
		std[4]="Nikhil";
		std[5]="Durga";
		std[6]="Pratibha";
		std[7]="Shivaji";
		std[8]="Hari";
		std[9]="Sonali";
		std[10]="Nisha";
		
		//for(int i=0; i<=10; i++)
		
		

		//for(int i=0;i<=std.length-1;i++)
			
//			for(int i=std.length-1;i>=0;i--)
//		{
//			
//			System.out.println(std[i]);
//
//		}
		
		// Enhance for loop
		
		for(String s:std)
		{
			System.out.println(s);
		}
		

	}

}
