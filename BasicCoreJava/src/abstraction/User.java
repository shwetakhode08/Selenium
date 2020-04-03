package abstraction;

public  class User {

	public static void main(String[] args) {

	MSWord obj=new Sprint2(); // write new without abstract class
	// Sprint2 obj=new Sprint2();
	// Sprint1 obj=new Sprint2();
	
	obj.save();
	obj.edit();
	obj.open();
	obj.saveAs();
	obj.undo();
	obj.exit();
	
	
	
	}

}
