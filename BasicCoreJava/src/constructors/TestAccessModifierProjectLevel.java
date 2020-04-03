package constructors;

import functions.AccessModifiers;

public class TestAccessModifierProjectLevel extends AccessModifiers 
{
	
public static void main(String[] args) 
    {
		
		AccessModifiers obj= new AccessModifiers();
		obj.publicFunction();
		
		TestAccessModifierProjectLevel obj2= new TestAccessModifierProjectLevel();
				obj2.protectedFunction();
		

		
	}

	

}


