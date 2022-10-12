package accesModifier;


class TestMode {

	private int d = 10;
	void mode() {
		System.out.println("private access modifier value:"+d);
	}
	
}

class TestMode2 {
	protected int f = 2000;
	protected void mode1() {
		System.out.println("Protected Mode Value:"+f);
	}
}

public class accessModeClass extends TestMode2 {

	public static void main(String[] args) {
		
//		TestMode ac = new TestMode();
//		ac.d = 20;  // variable is defined as private
//		ac.mode(); // method defined as private
		
		
		TestMode ac = new TestMode();  // example of default
		ac.mode();
		
		TestMode2 ac2 = new TestMode2();
		ac2.mode1();
	}

}
