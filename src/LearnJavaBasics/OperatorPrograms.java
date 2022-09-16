package LearnJavaBasics;

public class OperatorPrograms {

	public static void main(String[] args) {

		//Arithmetic Operators ---> + - * / %
		
		int a = 10;
		int b = 20;
		
		
		System.out.println("-----------Arithmetic Operators Examples-----------");

		System.out.println("Sum of a and b is:"+(a+b));
		System.out.println("Diff of a and b is:"+(b-a));
		System.out.println("Multiplication of a and b is:"+(a*b));
		System.out.println("Division of a and b is:"+(a/b));
		System.out.println("Mod div of a and b is:"+(a%b));
		
		
		//Relational Operators, Returns Boolean Values ----> == < > <= >= !=
		
		System.out.println("-----------Relational Operators Examples-----------");
		System.out.println("is a is equals b?:"+(a==b));
		System.out.println("is a is less b?:"+(a<b));
		System.out.println("is a greater than b ?:"+(a>b));
		System.out.println("is a less than or equals to b?:"+(a<=b));
		System.out.println("is a greater than or equals to b?:"+(a>=b));
		System.out.println("is a not equals to b?:"+(a!=b));
		

		//Logical Operators && || | , Logical Operator works between two boolean values
		
		Boolean x = true;
		Boolean y = false;
		
		System.out.println("-----------Logical Operators Examples-------------");
		System.out.println("is value of x and y is true ?:"+ (x && y));
		System.out.println("is value of x or y is true ?:"+(x || y));
		System.out.println("if x is true !x is what?:"+(!x));
		System.out.println("if y is fals !y is what?:"+(!x));
		
		//Increment /decrement Operators ++ , --
		
		int l=10;
		l++;
		int m=20;
		m--;
		
		System.out.println("-----------Incremental Operators Examples-------------");
		System.out.println("What is the Increment of integer L ?:"+l);
		System.out.println("What is the decrement of integer M ?:"+m);
		
		//Assignment Operators ==
		
		

	}

}
