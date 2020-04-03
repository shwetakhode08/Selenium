package arrays;

public class TwoDimentionArray2 {

	public static void main(String[] args) {
         
		String[][] data=new String[2][4];
		
		//Row 1
		data[0][0]="Shweta";
		data[0][1]="Khode";
		data[0][2]="Audh";
		data[0][3]="Mindtree";
		
		//Row 2
		data[1][0]="Puja";
		data[1][1]="Khot";
		data[1][2]="Wagholi";
		data[1][3]="Tcs";
		
		
		for(int row=0; row<2; row++)
		{
			for(int col=0; col<4; col++)
			{
				System.out.println(data[row][col]);
			}
		}
		
		System.out.println(data.length);
		System.out.println(data[0].length);
		
				
	}

}
