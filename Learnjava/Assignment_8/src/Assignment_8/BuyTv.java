package Assignment_8;

import java.util.Scanner;

public class BuyTv {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Budget");
		int Budg = scan.nextInt();
		if(Budg >= 40000) {
			System.out.println("You Can Afford Smart Tv with 42 inch display ");
		}
		else {
			if(Budg >= 25000 && Budg < 30000) {
			System.out.println("You Can Afford Smart Tv with 32 inch display ");
		}
			else {
			System.out.println("You Can Afford Normal Tv with 32 inch display ");
			}
			

	}

}
}
