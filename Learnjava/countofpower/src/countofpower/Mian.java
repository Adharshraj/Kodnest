package countofpower;

import java.util.Scanner;

public class Mian {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		System.out.println("Enter the power");
		int pow = scan.nextInt();
		countcalc c1= new countcalc();
		int res=c1.countcalcu(num, pow);
		System.out.println(res);

	}

}
