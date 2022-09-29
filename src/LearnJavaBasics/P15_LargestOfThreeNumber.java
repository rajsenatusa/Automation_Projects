package LearnJavaBasics;

import java.util.Scanner;

public class P15_LargestOfThreeNumber {

	public static void main(String[] args) {
		int FirstNumber, SecondNumber, ThirdNumber, Largest, TempNumber;
		
		try (Scanner input = new Scanner (System.in)) {
			System.out.println("Enter FirstNumber:");
			FirstNumber = input.nextInt();
			
			System.out.println("Enter SecondNumber:");
			SecondNumber = input.nextInt();
			
			System.out.println("Enter ThirdNumber");
			ThirdNumber = input.nextInt();
		}
		TempNumber = (FirstNumber > SecondNumber )? FirstNumber:SecondNumber;
		
		
		Largest = (ThirdNumber > TempNumber)? ThirdNumber:TempNumber;
		
		System.out.println("The Largest Number is :" +Largest) ;
		

	}

}
