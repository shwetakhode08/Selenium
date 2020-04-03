package functions;

public class TestAccessModifiresPackageLevel {

public static void main(String[] args) {
		
		AccessModifiers obj= new AccessModifiers();
		obj.publicFunction();
		obj.noAccessmodFunction();
		obj.protectedFunction();
		
	}
}
