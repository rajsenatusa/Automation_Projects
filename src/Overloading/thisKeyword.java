package Overloading;

public class thisKeyword {
	
	int a, b; // class variable
	
	void getValues (int a, int b) { // method variables
		
		this.a = a;
		this.b = b;
		
	}
	
	void printValues () {
		System.out.println("Values:" +a);
		System.out.println("Values:" +b);
	}
	
	public static void main(String[] args) {
		
		thisKeyword tk = new thisKeyword ();
		tk.getValues(20, 50);
		tk.printValues();
		
	}

}
