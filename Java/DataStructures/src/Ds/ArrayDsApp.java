package Ds;

import java.util.Scanner;

public class ArrayDsApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length of the array");
		int n=scan.nextInt();
		Array arrds=new Array(n);
		while(true) {
			System.out.println("Enter 1 for insert");
			System.out.println("Enter 2 for delete");
			System.out.println("Enter 3 for display");
			System.out.println("Enter any number for exit");
			int ch=scan.nextInt();
			switch(ch) {
			case 1:arrds.insert();
			break;
			case 2:arrds.delete();
			break;
			case 3:arrds.display();
			break;
			default:
				System.out.println("TATA bye bye");
				System.exit(0);
			}
		}

	}

}
