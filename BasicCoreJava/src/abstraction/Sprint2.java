package abstraction;

 // don't need Abstract because all incomplete/black lock are cover in below
// concrite class
public class Sprint2 extends Sprint1 {
	
	@Override
	public void saveAs() {

		System.out.println("Save as feature");
	}

	@Override
	public void undo() {
		System.out.println("Undo feature");		
	}

	@Override
	public void exit() {
		System.out.println("Exit feature");		
	}

}
