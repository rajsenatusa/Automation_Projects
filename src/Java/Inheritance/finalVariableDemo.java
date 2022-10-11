package Java.Inheritance;

public class finalVariableDemo {
	
	final int speed = 50;
	
	// variable > you cannot change the value of the variable

	public static void main(String[] args) {

		finalVariableDemo few = new finalVariableDemo();
		//few.speed  // compile time error.
		
		System.out.println(few.speed);

	}

}
