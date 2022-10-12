package interfaceofJava;

interface ParentOne {
	int parentvariable = 10;
	void ParentMethodOne(); 
	
}

interface InterfaceTwo {
	int parentvariable2 = 20;
	void ParentMethodTwo(); 
	
}

interface InterfaceThree {
	int parentvariable3 = 30;
	void ParentMethodThree(); 
	
}


// multiple parent class for one class.
public class multipleInheritanceUsingInterface implements ParentOne, InterfaceTwo,InterfaceThree {

	

	@Override
	public void ParentMethodThree() {
		System.out.println("value is from parent method three :" +parentvariable3);
	}

	@Override
	public void ParentMethodTwo() {
		System.out.println("value is from parent method tow :" +parentvariable2);
		
	}

	@Override
	public void ParentMethodOne() {
		System.out.println("value is from parent method one :" +parentvariable);
		
	}
	
public static void main(String[] args) {
	
	multipleInheritanceUsingInterface multi = new multipleInheritanceUsingInterface ();
	multi.ParentMethodOne();
	multi.ParentMethodTwo();
	multi.ParentMethodThree();
	}

}
