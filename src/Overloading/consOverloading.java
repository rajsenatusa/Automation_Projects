package Overloading;

public class consOverloading {
	
	consOverloading (int a, int b) {

		System.out.println("Construction Overloading Addition:" +(a+b));
	}
	
	consOverloading (int a, int b, int c) {

		System.out.println("Construction Overloading Addition:" +(a+b+c));
	}
	
	consOverloading (int a, double b) {

		System.out.println("Construction Overloading Addition:" +(a+b));
	}
	
	consOverloading (double a, double b) {

		System.out.println("Construction Overloading Addition:" +(a+b));
	}
	
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		consOverloading	consLoad1 = new consOverloading (5, 55);
		
		@SuppressWarnings("unused")
		consOverloading	consLoad2 = new consOverloading (5, 55, 100);
		
		@SuppressWarnings("unused")
		consOverloading	consLoad3 = new consOverloading (5, 55.5);
		
		@SuppressWarnings("unused")
		consOverloading	consLoad4 = new consOverloading (65.5, 55.5);
	}

}
