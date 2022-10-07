package LearnJavaBasics;

public class P20_Employee {
	
	int eid;
	String ename;
	double sal;
	int depno;
	String jobtitle;
	
	//example of method
	void display () {
		
		System.out.println("Employee Id:" +eid);
		System.out.println("Employee Name:" +ename);
		System.out.println("Employee Salary:" +sal);
		System.out.println("Employee Department Number: " +depno);
		System.out.println("Employee Job Title: "+jobtitle);		
	}
	
	public static void main (String args[]) {
		
		P20_Employee emp1 = new P20_Employee ();
		emp1.eid = 101;
		emp1.ename = "David";
		emp1.sal = 28000.00;
		emp1.depno = 10;
		emp1.jobtitle = "Manager";
		emp1.display();
		
		P20_Employee emp2 = new P20_Employee ();
		emp2.eid = 102;
		emp2.ename = "John";
		emp2.sal = 128000.00;
		emp2.depno = 12;
		emp2.jobtitle = "CEO";
		emp2.display();
		
	}

}
