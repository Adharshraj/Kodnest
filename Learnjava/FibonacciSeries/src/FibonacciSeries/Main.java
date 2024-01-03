package FibonacciSeries;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		printFibonacciSeries(n);

	}
	public static void printFibonacciSeries(int n)
	{
/*	int sum=0;
	int num1=1;
	int num2=0;
	if(n==1) {
		System.out.print(num2+" ");
	}
	else if(n==2) {
		System.out.println(num2+" "+num1);
	}
	else {
		System.out.print(num2+" ");
		for(int i=0;i<n-1;i++) {
			sum=num1+num2;
			System.out.print(num1+" ");
			num2=num1;
			num1=sum;
			
		}
	}
	} 

}
*/
		int sum=0;
		int num1=1;
		int num2=0;
		System.out.print("0 ");
		for(int i=0;i<n-1;i++) {
			sum=num1+num2;
			System.out.print(num1+" ");
			num2=num1;
			num1=sum;
			if(num1>=n){
				break;
			}
			
		}
		} 

	}
