package arrays;

public class Assignment3 {

	public static void main(String[] args) {
		  
        int[] arr= {10,20,30,40,50,60,70,80,90,100};
		
		//boolean flag=false;
		int count=0;
		
		for(int i=0; i<arr.length;i++)
		{
		       for (int j=i+1; j<arr.length;j++) {
		    	   if (arr[i]==arr[j]) 
		    	   {
		    		   count++;
		    	   }
		       }
	    }
		
		System.out.println("duplicates present " + count +" times");
//		if(flag)
//		{
//			System.out.println("40 is present in array " + count +" times");
//		}else {
//		    System.out.println("40 is not present in array");
//		}

	}

}
