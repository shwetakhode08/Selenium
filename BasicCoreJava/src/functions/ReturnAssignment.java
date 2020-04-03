package functions;

public class ReturnAssignment {
	
	int age=31;
	static int stds=11;

	public static void main(String[] args) {
		
//1.		int temp=0;
//		System.out.println(temp);
//		temp=sum(10,20);
//		System.out.println(temp);
//	
//		int temp1=0;
//		System.out.println(temp);
//		temp1=sum(40,50);
//		System.out.println(temp1);
//		System.out.println(temp+temp1);
		
//2.		int temp=sum(10,20);
//		int temp1=sum(40,50);
//		System.out.println(temp+temp1);
		
		
	
        System.out.println(sum(10,20)+sum(40,50));
        
        System.out.println(message("Shweta"));
        
        System.out.println(message("Shweta",31));
        
        System.out.println(message("Shweta",31,true));
        
        String[] arr=names();
        
        for(int i=0;i<arr.length; i++)
        {
        	System.out.println(arr[i]);
        }
        
        String[][] arr1=datas();
        for(int row=0; row<4; row++)
		 {
			 for(int col=0; col<2; col++)
			{
				System.out.print(arr1[row][col]+" ");
			}
			 System.out.println();
		 }
       
	}
	
	public static int sum(int x,int y)
	{
		return x+y;
	
	}
	
	public static String message(String name)
	{
		return "Your name is "+name;
		
	}
	
	public static String message(String name,int age)
	{
		return "Your name is "+name + " and your age is "+age;
		
	}
	

	public static String message(String name,int age,boolean marritalstatus)
	{
		if(marritalstatus==true)
			return "Your name is "+name + " and your age is "+age +" and you are married";
		else 
			return "Your name is "+name + " and your age is "+age +" and you are unmarried";
	}
	
	
	public static String[]  names()
	{
		
		String[] str=new String[2];
		str[0]="Shweta";
		str[1]="Anand";
		
		return str;
		
	}
	
   public static String[][] datas()
	{
	   String[][] data=new String[4][2];
        // Row 1
		 data[0][0]="Username";
		 data[0][1]="Password";
		 
		 
		 // Row 2
		 data[1][0]="Username1";
		 data[1][1]="Password1";
		 
		 
		 // Row 3
		 data[2][0]="Username2";
		 data[2][1]="Password2";
		 
		 
		 // Row 4
		 data[3][0]="Username3";
		 data[3][1]="Password3";
	   
		 return data;
	}
   
   
	
	
}
