package Java.Inheritance;

public class animal {

		// super can be used to refer immediate parent class instance variable
		// super keyword can be used refer immediate parent class method
		// super () can be used to invoke immediate parent class constructor.
	
	String color = "White";
	
	void eating () {
		System.out.println("Eating.....");
	}
	
	animal () {
		System.out.println("Animal..created");
	}
	
}

class dog extends animal {
	String color = "Black";
	
//	void displaycolor() {
//		//System.out.println(color);
//		System.out.println(super.color);
//	}
	
	dog(){
		super();
		System.out.println("Dog Created....");
	
	}
//	void eating () {
//		System.out.println("Eating Bread....");
//		super.eating();
//	}
}

