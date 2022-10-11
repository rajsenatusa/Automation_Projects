package Java.Inheritance;


class bike {
	
//	final void run () { // this is the final type method, hence we can't override the method in child class
//		System.out.println("Running......");
//	}
	
	// if class is final, we cannot extend further.
	
	void run () { // this is the final type method, hence we can't override the method in child class
		System.out.println("Running......");
	}
}

class honda extends bike {
	void run () {
		System.out.println("Started.......");
	}
}

public class finalMethodDemo {
	

	public static void main(String[] args) {

	}

}
