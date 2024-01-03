package NumberTablePrinter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a Number");
		int num = scan.nextInt();
		printTable(num);

	}
	public static void printTable(int num)
	{
	int n =1;
	while(n<=10) {
		int a=num * n;
		System.out.println(num+"*"+n+"="+a);
		n++;
	}
	} 

}
