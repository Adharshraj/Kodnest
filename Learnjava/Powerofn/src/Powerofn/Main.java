package Powerofn;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		System.out.println("Enter the power");
		int pow = scan.nextInt();
		powerofn p1= new powerofn();
		int res=p1.powerofn(num, pow);
		System.out.println(res);

	}

}
