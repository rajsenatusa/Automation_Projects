package LearnJavaBasics;

public class P19_StringMethod {

	public static void main(String[] args) {

		String firstString = "Welcome ";
		String secondString = "To Java World";
		String thirdString = "welcome ";
		
		System.out.println("Lengnth of the first string: " 
		+firstString.length());
		
		System.out.println("Concatenation of two strings: "
		+firstString.concat(secondString));
		
		System.out.println("Triming of first string: "
				+firstString.trim());
		
		System.out.println("Get 3rd Charactor of first string: "
				+firstString.charAt(3));
		
		System.out.println("Verify text Java is prensent in the 2nd string: "
				+secondString.contains("Java"));
		
		System.out.println("Compare First String and Second String:"
				+firstString.equals(secondString));
		
		System.out.println("Equal ignore of first string and 3rd string: "
				+firstString.equalsIgnoreCase(thirdString));
		
		System.out.println("Replace Texts: " +secondString.replace("Java", "Selenium"));
		
		System.out.println("Substring of second text: "
				+secondString.substring(3, 7));
		
		System.out.println("Convert to Upper Case: " 
				+secondString.toUpperCase());
		
		
		// sum values of an array
		//search specific number in an array
		// search specific string in an array
		//print even and odd number in an array
		// find greatest and smallest number in an array
		//program to add two metrics
	}

}
