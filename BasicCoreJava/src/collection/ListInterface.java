package collection;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) 
	{
//		List list=new ArrayList<>();
//		
//		 u can use object at that time i can use any datatype int,string
//        list.add("shweta")
		
		List<String> list=new ArrayList<>();
		
		list.add("shweta");
		list.add("techbodhi");
		list.add("khode");
		for(String s:list)   // inhance for loop use in collection
		
		{
			System.out.println(s);
		}
	}

}
