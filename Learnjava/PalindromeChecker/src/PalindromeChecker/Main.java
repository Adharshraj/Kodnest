package PalindromeChecker;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		PalindromeCheck b1=new PalindromeCheck();
		boolean res = b1.Palicheck(num);
		if(res == true) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is Not Palindrome");
		}
	}

}
