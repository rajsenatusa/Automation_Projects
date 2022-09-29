package LearnJavaBasics;

import java.util.Scanner;

public class P12_PositiveOrNegative {

	public static void main(String[] args) {
		
		int number;
		
		try (Scanner input = new Scanner (System.in)) {
			System.out.println("Enter The Number:");
			
			number = input.nextInt();
		}
		if (number>0) {
			System.out.println("Entered Number is Positive");
		}else if (number<0) {
			System.out.println("Entered Number is Negative");
		}else {
			System.out.println("Entered Number is Zero");
		}
	}

}
