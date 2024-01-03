package recursion;

import java.util.Scanner;

public class Mian {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		GCDCalc gcd=new GCDCalc();
		int res=gcd.GCD(a, b);
		System.out.println(res);

	}

}
