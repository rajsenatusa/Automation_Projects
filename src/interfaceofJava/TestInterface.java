package interfaceofJava;


interface A {
	
	int a = 10 ; // by default variables in interface are static and final
	
	void methodOne (); // this is an abstract method, by default this method is public, we need a class to implements

}



public class TestInterface implements A { // must implement the methods from interface.

	// interface is a blue print of class
	// interface contains final and static variables
	// interface contains abstract methods.
	// An abstract method is a method contains definition but not body.
	// Interface supports the functionality of multiple inheritance.
	// We can define interface with interface keyword
	// A class extends another class and interface extends another interface but a class implements an interface.
	// We can create object reference for interface but we cannot instantiate interface.
	
	
	@Override
	public void methodOne() {
		System.out.println("Print value from the interface A :" +a);
		
	}
	
	public static void main(String[] args) {
		
		TestInterface TI = new TestInterface();
		TI.methodOne();
		
		A a = new TestInterface(); // we can create a interface for variable, cannot instantiate (with interface name).
		a.methodOne();

	}



}
