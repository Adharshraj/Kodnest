package AgeCategorizer;

import java.util.Scanner;

public class Main {
	public static void categorizeAge(int age) {
		if(age <= 12) {
			System.out.println("Child");
		}
		else if(age <= 19 && age > 12) {
			System.out.println("Teen");
		}
		else if(age <= 59 && age > 19) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior");
		}
		}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter your Age");
		int age = scan.nextInt();
		categorizeAge(age);

	}

}
