package TheCalculatorDilemma;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("Enter 1 for Addition, 2 for Substraction,3 for Multiplication, 4 for division");
		int oper = scan.nextInt();
		switch(oper)
		{
		case 1:
			Addition(num1 , num2);
			break;
		case 2:
			Substraction(num1 , num2);
			break;
		case 3:
			Multiplication(num1 , num2);
			break;
		case 4:
			Division(num1 , num2);
			break;
		default:
			System.out.println("You Entered a Wrong Operation");
		}
	}
	public static void Addition(int num1,int num2) {
		int res1= num1+num2 ;
		System.out.println("The Addition Result is = "+res1);
	}
	public static void Substraction(int num1,int num2) {
		int res2= num1-num2 ;
		System.out.println("The Substraction Result is = "+res2);
	}
	public static void Multiplication(int num1,int num2) {
		int res1= num1*num2 ;
		System.out.println("The Multiplication Result is = "+res1);
	}
	public static void Division(int num1,int num2) {
		int res1= num1/num2 ;
		System.out.println("The Division Result is = "+res1);
	}
		
	

}
