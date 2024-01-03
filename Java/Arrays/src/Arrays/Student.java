package Arrays;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter no of students");
		int num= scan.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter mark of student "+(i+1)+" : ");
			arr[i]=scan.nextInt();
		}
		System.out.println("Mark of students are");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Mark of student "+(i+1)+" = "+arr[i]);
		}

	}

}
