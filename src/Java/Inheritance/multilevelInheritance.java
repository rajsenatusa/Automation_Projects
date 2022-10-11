package Java.Inheritance;

class A {
	int a;
	void displayA()
	{
		System.out.println(a);
	}
}

class B extends A {
	int b;
	void displayB () {
		System.out.println(b);
	}
	
}

class C extends B {
	int c;
	void displayC() {
		System.out.println(c);
	}
	
}

public class multilevelInheritance {

	public static void main(String[] args) {
		
		C obj = new C();
		obj.a = 2;
		obj.b = 3;
		obj.c = 4;
		
		obj.displayA();
		obj.displayB();
		obj.displayC();
		
	}

}
