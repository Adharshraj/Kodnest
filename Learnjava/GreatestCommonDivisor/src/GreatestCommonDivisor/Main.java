package GreatestCommonDivisor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter first number");
		int a = scan.nextInt();
		System.out.println("Enter second number");
		int b = scan.nextInt();
		findGCD(a, b);

	}
	public static void findGCD(int a, int b) 
	{
		int c=0;
		if(a < b ) {
			for(int i=2;i<=a;i++) {
				if(a%i==0) {
					if(b%i==0) {
						c=i;
					}
					
				}
			}System.out.println(c);
	}
	}
}
