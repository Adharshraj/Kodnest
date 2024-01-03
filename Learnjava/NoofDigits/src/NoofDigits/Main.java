package NoofDigits;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		long num = scan.nextInt();
		Noofdigits d1= new Noofdigits();
		long res=d1.noofdigits(num);
		System.out.println(res);
	}

}
