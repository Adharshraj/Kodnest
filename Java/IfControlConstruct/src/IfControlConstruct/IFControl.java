package IfControlConstruct;

import java.util.Scanner;

public class IFControl {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Mark");
		int marks = scan.nextInt();
		System.out.println("Welcome To KodNest");
		Techclub(marks);
	}
	public static void Techclub(int marks) {
		if (marks >= 80) {
			System.out.println("Welcome To Tech Club");
		}
		
	}
	

}
