package interfaceofJava;

class F1 {
	int a = 1231;
	void m1 () {
		System.out.println("from class f1 value is :" +a);
	}
}

interface I1 {
	
	int b = 9855;
	void m2();
	
}

interface I2 {
	int c = 565;
	void m3 ();
	
}

public class hybridInheritance extends F1 implements I1, I2

{
	
	@Override
	public void m3() {
		System.out.println("implemented interface method 3 :" +c);
	}

	@Override
	public void m2() {
		System.out.println("implemented interface method 2 :" +c);
		
	}

	public static void main(String[] args) {
	
		hybridInheritance tata = new hybridInheritance ();
		tata.m1();
		tata.m2(); // this is from interface I1
		tata.m3(); // this is from interface I2
	}



}
