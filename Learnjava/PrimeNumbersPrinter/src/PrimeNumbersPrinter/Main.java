package PrimeNumbersPrinter;

import java.util.Scanner;

public class Main {
	public static void printPrimes(int n)
	{
	int	count = 0;
	int a=0;
achu:	for (int i=1;i>0;i++) {
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
				count++;
				}
			}
			if(count==1) {
				System.out.print(i+" ");
				a++;
				if(a>=n) {
					break achu;
				}
				
			}
			count=0;
	
		
	}
	}
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		printPrimes(n); } 


}