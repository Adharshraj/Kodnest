package SumofDigitsCalculator;

import java.util.Scanner;

public class Main {
	public static void calculateSumOfDigits(int n)
	{
	int b=0;
	int sum=0;
	while(n>0) {
		b=n%10;
		n=n/10;
		sum=sum+b;
	}
	System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = scan.nextInt();
		calculateSumOfDigits(num);

	}

}
