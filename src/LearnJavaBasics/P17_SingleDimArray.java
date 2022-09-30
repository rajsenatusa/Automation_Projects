package LearnJavaBasics;

public class P17_SingleDimArray {

	public static void main(String[] args) {
		
//		//declare array
//		int firstArray[] = new int[5];
//		//Storing values in to array
//		firstArray[0] = 100;
//		firstArray[1] = 200;
//		firstArray[2] = 300;
//		firstArray[3] = 400;
//		firstArray[4] = 500;
			
		int firstArray[] = {100,200,300,400,500};
		
		System.out.println ("Length of an Array :" +firstArray.length);
		
		
		for (int i=0; i<=firstArray.length-1; i++) {
			System.out.println("Value From Array :" +firstArray[i]);
		}
		
		
		for (int j:firstArray ) {
			
			System.out.println("Read Value from Arrray Using Ehanced For Loop :" +j);
			
		}
	}

}
