package Galaxy;

import java.util.Scanner;



public class Arithematica {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Num1");
		long num1=scan.nextLong();
		System.out.println("Enter Num2");
		long num2=scan.nextLong();
		System.out.println("the output is = "+galacticAddition(num1,num2));

	}
	public static long galacticAddition(long num1, long num2) {
		long c= num1+num2;
		return c;
	}

}
