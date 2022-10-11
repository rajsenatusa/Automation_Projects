package Overloading;

public class OverloadingMethods {
	
	void add(int a, int b) {
		System.out.println("Addition of Number:" +(a+b));
	}
	
	void add(int a, double b) {
		System.out.println("Addition of Number:" +(a+b));
	}

	void add(int a, int b, int c) {
		System.out.println("Addition of Number:" +(a+b+c));
	}

	void add(double a, double b) {
		System.out.println("Addition of Number:" +(a+b));
	}
	

	public static void main(String[] args) {
		
		OverloadingMethods overload = new OverloadingMethods();
		
		overload.add(5, 6);
		
		overload.add(50, 100,200);
				
		overload.add(10, 10.5);
		
		overload.add(11.5, 12.5);
	}
}