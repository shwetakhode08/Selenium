package arrays;

public class DifferentDataType {

	public static void main(String[] args) {
       
		// class
		Object[] obj= new Object[3];
		obj[0]=10;
		obj[1]=true;
		obj[2]="Shweta";
		
		for(Object s:obj)
		{
			System.out.println(s);
		}
				
				
	}

}
