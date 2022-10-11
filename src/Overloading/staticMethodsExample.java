package Overloading;

public class staticMethodsExample {
	
	static int a =35; // static variable
	int b =55; // non static variable
	static String S = "Welcome";
	
	static void methodOne () {
		System.out.println("This is my static method one:");
	}
	
	void methodTwo ()
	{
		System.out.println("This is my non static method two:");
	}
	
	void methodThree() {
		//both static and non static variable we can access from non static method.
		System.out.println("From Non Static Method, I am accessing Non Static Variables");
		System.out.println(a);
		System.out.println(b);
		
		// we can access static or non static method directly without 
		// creating object from Non-Static Method, No need of Object. 
		methodOne();
		methodTwo();		
	}
	
	public static void main(String[] args) {

		System.out.println(staticMethodsExample.a); // static variable can be accessed using class name
		//static method can only access static stuff
		
		System.out.println("Strng Length :"+(staticMethodsExample.S).length());
		
		methodOne();		
		staticMethodsExample sm	= new staticMethodsExample ();
		//methodTwo(); //we need object to access non static method from static method.
		sm.methodTwo(); 
		sm.methodThree();

	}

}
