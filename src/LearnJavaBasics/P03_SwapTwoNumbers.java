package LearnJavaBasics;

public class P03_SwapTwoNumbers {

	public static void main(String[] args) {
		//before swap a= 10 ; b=20
		//after swap a=20 ;	b=10
		
		int firstNumber = 10;
		int secondNumber = 20;
		
		System.out.println("-------Before Swap:------");
		System.out.println("First Number:"+firstNumber);
		System.out.println("Second Number:"+secondNumber);
		
		//value of first number is assigned to temporary 
		int temporaryNumber = firstNumber;
		//value of second number is assigned to first number
		firstNumber = secondNumber;
		
		//Value of 2nd number is assigned to temporary
		secondNumber= temporaryNumber;
		
		System.out.println("-------After Swap:-------");
		System.out.println("First Number:"+firstNumber);
		System.out.println("Second Number:"+secondNumber);
	}

}
