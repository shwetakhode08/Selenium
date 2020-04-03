package functions;

public class AccessModifiers {

	public static void main(String[] args) {
		
		AccessModifiers obj= new AccessModifiers();
		obj.publicFunction();
		obj.privateFunction();
		obj.noAccessmodFunction();
		obj.protectedFunction();
	}

		// public-throught  out function
		
		public void publicFunction()
		{
			System.out.println("Public function");
		}
		 
		
		private void privateFunction()
		{
			System.out.println("Private function");
			
		
		}
		
		void noAccessmodFunction()
		{
			System.out.println("No access mod function");
		}
		
		protected void protectedFunction()
		{
			System.out.println("Protected function");
		}
		
		
		
	

}
