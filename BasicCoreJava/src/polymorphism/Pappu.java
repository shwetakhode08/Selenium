package polymorphism;

public class Pappu {

	public static void main(String[] args) {

//		Smartphone phone= new Smartphone();
//		
//		phone.calling();
//		
//		Telephone phone2= new Telephone();
//		
//		phone.calling();
//		
//		Mobile phone3= new Mobile();
//		
//		phone.calling();
//			
//		Object obj= new Telephone();  //  object is super class
//		obj=new Mobile();
//		obj=new Smartphone();
		
		
    Object obj;
	obj= new Telephone();  
	obj=new Mobile();
	obj=new Smartphone();
		
		
		Telephone phone2;
		phone2=new Telephone();
		phone2=new Smartphone();
		phone2=new Mobile();
		
		
		
		Mobile phone3;
		
		phone3=new Mobile();
		phone3=new Smartphone();
		
		
		Smartphone phone4;
		phone4=new Smartphone();
		
		
		
		
		
		
		
	
	}

}
