package LearnJavaBasics;

public class Student {
	
	int studentid;
	String studentName;
	int subjectOne;
	int subjectTwo;
	int subjectThree;
	
	void getStudentData (int id, String name) {
		
		studentid = id;
		studentName = name;
	}
	
	
	void getStudentMarks (int s1, int s2, int s3) {
		subjectOne =s1;
		subjectTwo =s2;
		subjectThree =s3;
	}

	void totalMarks () {
		
		int total = subjectOne+subjectTwo+subjectThree;
		System.out.println("Student ID:" +studentid);
		System.out.println("Student Name:" +studentName);
		System.out.println("Total Marks:"+total);		
	}

	
	public static void main(String[] args) {
		
		
		//Assign values using reference variable
		//		stu.studentid = 25;
		//		stu.studentName = "Joshua";
		
		
		Student stu = new Student ();
		//Assign values using reference variable
		//		stu.studentid = 25;
		//		stu.studentName = "Joshua";
		
		//Assign values using method
		stu.getStudentData(15, "Jeeva");
		stu.getStudentMarks(50, 75, 100);
		stu.totalMarks();
		
	}
	
}
