package Java.Inheritance;


class ParentClass {
	int a;
	void display(){
		System.out.println(a);
	}
	
}

class ChildClassA extends ParentClass{
	
	int b;
	void print() {
		System.out.println(b);
	}
	
}

public class singleInheritance {

	
	//Single Inheritance
	//Multilevel Inheritance
	//Hierarchical Inheritance
	//Multiple Inheritance  ---  can be achieved through concept called Interface along with implements
	//Hybrid Inheritance ---  can be achieved through concept called Interface along with implements
	
	public static void main(String[] args) {
		
		ParentClass singleih = new ParentClass ();
		singleih.a = 100;
		singleih.display();
		
		ChildClassA singleihc = new ChildClassA ();
		singleihc.a = 200;
		singleihc.b = 300;
		singleihc.print();
		singleihc.display();

	}

}
