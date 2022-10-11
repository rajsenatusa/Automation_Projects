package Java.Inheritance;


class bank{
	
	double rateOfInterest () {
		
		return 1.2;
	}
	
}

class Sbi extends bank {
	
	double rateOfInterest () {
		
		return 3;
	}
	
}


class icici extends bank {
	
	double rateOfInterest () {
		return 2.5;
		
	}
	
}

class Axis extends bank {
	
	double rateOfInterest () {
		return 2;
		
	}
	
}

public class overridingExample {

	public static void main(String[] args) {

		//redefining a parent class method in the child class is call overriding.
		//method definition should not change, but body will change.
		//overriding should be achieved only through the inheritance / Overloading can be achieved without inheritance.
		
		//to achieve overriding we need at-least two class
		
		Sbi s = new Sbi ();
		System.out.println (s.rateOfInterest());
		
		icici i = new icici ();
		System.out.println (i.rateOfInterest());
		
		Axis a = new Axis ();
		System.out.println(a.rateOfInterest());
		
		
	}

}
