package FactorialCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a numer");
		int n = scan.nextInt();
		calculateFactorial(n);

	}
	public static void calculateFactorial(int n)
	{
	int Fac=1;
	for (int i=1;i<=n;i++) {
		Fac=Fac*i;
	}
	System.out.println(Fac);
	}

}
