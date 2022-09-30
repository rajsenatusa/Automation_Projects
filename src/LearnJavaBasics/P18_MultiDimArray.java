package LearnJavaBasics;

public class P18_MultiDimArray {

	public static void main(String[] args) {
		
//		int twoDimArray[][] = new int [3][2];
		
//		twoDimArray[0][0] = 100;
//		twoDimArray[0][1] = 200;
//		
//		twoDimArray[1][0] = 300;
//		twoDimArray[1][1] = 400;
//		
//		twoDimArray[2][0] = 500;
//		twoDimArray[2][1] = 600;
		
		
		int twoDimArray[][] = {{100, 200}, {300, 400}, {500, 600}, {700,800}};
		
		System.out.println("Row Length of an Array: " +twoDimArray.length);
		System.out.println("Column Length of an Array: "+twoDimArray[0].length);
		
		for (int i=0; i<twoDimArray.length; i++) {
			
			for (int j=0 ; j<twoDimArray[j].length; j++) {
				
				System.out.println("Array Values: " +twoDimArray[i][j]);
			}
		}
		
		
		for (int row[]:twoDimArray ) {
			
			for (int col:row) {
				
				System.out.println("Array Value Read from Advanced For Loop: " +col);
			}
			
			
		}
		
	}

}
