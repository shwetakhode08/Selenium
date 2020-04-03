package polymorphism;

public class Pappu3 {

	public static void main(String[] args) {

		// 1.can be use parent class reference for child class object
		Telephone phone=new Smartphone();
		
		// 2.can only call function which are presenting parents class and
		// 3.overiden function will be from child class
		phone.calling();
		
		// 2.can only call function which are presenting parents class 
		phone=new Mobile();
		phone.calling();
		
	}

}
