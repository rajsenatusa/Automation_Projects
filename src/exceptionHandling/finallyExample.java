package exceptionHandling;

public class finallyExample {

	public static void main(String[] args) {
		
		System.out.println("Program Started");
		
		int a = 100;
		
		try {
			System.out.println(a/0);
		}catch (Exception e) {
			System.out.println(e);
			System.out.println("Entered in to catch block");
		}
		finally {
			System.out.println("Entered in to finally block");
		}
		
		System.out.println("Program Ended");

	}

}
