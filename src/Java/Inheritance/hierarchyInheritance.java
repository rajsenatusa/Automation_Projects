package Java.Inheritance;


class ParentHierarchy {
	
	int a;
	void display () {
		System.out.println(a);
	}
}

class Child1 extends ParentHierarchy {
	int b;
	void child1display() {
		System.out.println(b);
	}
}

class Child2 extends ParentHierarchy {
	int c;
	void child2display() {
		System.out.println(c);
	}
}

public class hierarchyInheritance {

	public static void main(String[] args) {

		Child1 c1 = new Child1 ();
		c1.a = 100;
		c1.b = 200;
		c1.display();
		c1.child1display();
		
		
		Child2 c2 = new Child2 ();
		c2.a = 300;
		c2.c =400;
		c2.display();
		c2.child2display();

	}

}
