package exceptionHandling;


// checked exceptions identified by complier
// this can be handled by try catch block and throws keyword
public class checkedExceptionExample {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Program is started");
		System.out.println("Program is Inprogress");
		
		// example of checked exceptions
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//
//		}
		
		Thread.sleep(5000);
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");
	}

}
