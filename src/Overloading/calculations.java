package Overloading;

public class calculations {
	
	
	// This program is a example to explain the constructors
	
	int numberOne, numberTwo, numberThree;
	
	calculations (int n1, int n2, int n3) {
		
		numberOne = n1;
		numberTwo = n2;
		numberThree =n3;
	}
	
	void sum () {
		
		int valSum = numberOne+numberTwo+numberThree;
		System.out.println("Sum of the numbers are :" +valSum);
	}

	public static void main(String[] args) {
		
		calculations calc = new calculations (600, 600, 600);
		calc.sum();
			
	}

}
