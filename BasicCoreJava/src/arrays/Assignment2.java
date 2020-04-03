package arrays;

public class Assignment2 {

	public static void main(String[] args) {
		
		  
        int[] arr= {10,20,30,40,50,60,70,40,90,100};
		
		boolean flag=false;
		int count=0;
		
		for(int s:arr)
		{
		       if(s==40)
				{
					flag=true;
					count++;
					//break;
				}
	    }
		if(flag)
		{
			System.out.println("40 is present in array " + count +" times");
		}else {
		    System.out.println("40 is not present in array");
		}

	}

}
