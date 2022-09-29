package LearnJavaBasics;

public class P14_MultiplicationTable {

	public static void main(String[] args) {
		int number = 5;
		
		for (int i=1; i<=10; i++) {
			
				System.out.printf("%d * %d = %d \n", number, i, number*i);
		
		}

		System.out.println("Multiplication Table 9 Using While Loop");
		
		int whilenumber = 9;
		int j = 1;
		
		while (j<10) {
			
			System.out.printf("%d * %d = %d \n", whilenumber, j, whilenumber*j);
			j++;
		}
	}

}
