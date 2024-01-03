package ArithmeticOperations;

import java.util.Scanner;

public class Arithemetic {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter 2 numers for Subtraction");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("The Subtraction Result is = " + subtractNumbers( num1 ,num2));
		System.out.println("Enter 2 numers for Multiplicationcation");
		 num1 = scan.nextInt();
		 num2 = scan.nextInt();
		System.out.println("The Multiplication Result is = " + multiplyNumbers( num1,num2));
		System.out.println("Enter 2 numers for Division");
		 num1 = scan.nextInt();
		 num2 = scan.nextInt();
		System.out.println("The Divison Result is = " + divideNumbers( num1,num2));
		System.out.println("Enter 2 numers for Remainder");
		 num1 = scan.nextInt();
		 num2 = scan.nextInt();
		System.out.println("The Remainde After Division Result is = " + findRemainder( num1,num2));
		

	}
	public static int subtractNumbers(int num1, int num2)
	{
		return num2 - num1 ;
	}
	public static int multiplyNumbers(int num1, int num2)
	{
		return num1 * num2 ;
	}
	public static double divideNumbers(double num1, double num2)
	{
		return (num1 / num2) ;
	}
	public static int findRemainder(int num1, int num2)
	{
		return num1 % num2 ;
	}

}
