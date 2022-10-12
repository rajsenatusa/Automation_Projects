package exceptionHandling;


// checked exception > exception checked / identified by the compiler.
// 1.InterruptedException
// 2.IOException
// 3.FileNotFoundException


// unchecked exception-> exception are not checked /identified by compiler
// 1.Arithmetic Exception
// 2.NullPointerException
// 3.NumberformatException
// 4.ArrayIndeexOutofBounds exception
public class exceptionhadle {

	
	@SuppressWarnings("null")
	public static void main(String[] args) {

		try {
			int a = 508/0;
			System.out.println(a);
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		String s = null;
		try {
			System.out.println(s.length());
		}catch (NullPointerException e) {
			System.out.println(e);
		}
		
		String s1 = "abc";
		try {
		
			Integer.parseInt(s1);
			
		}catch (NumberFormatException e) {
			System.out.println(e);
		}

		try {
			int arrayTest[] = new int [5];
			arrayTest[10] = 50;
		}catch (Exception e) {
			System.out.println(e);
		}


		
	}
}
