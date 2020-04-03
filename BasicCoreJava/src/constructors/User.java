package constructors;

public class User {

	public static void main(String[] args) {
//       object ref= all object
		
		Car car1= new Car();
		//  instance variables below 3 lines
		
		car1.brand="Maruti";
		car1.color="white";
		car1.type="Petrol";
		Car.wheels=6;
		car1.features();
		
		Car car2= new Car();
		car2.brand="Merecedes";
		car2.color="Black";
		car2.type="Petrol";
		Car.wheels=4;
		car2.features();
		
		Car car3= new Car();
		car3.brand="Tesla";
		car3.color="Golden";
		car3.type="Electric";
		Car.wheels=6;
		car3.features();
		
		
		
	}

}
