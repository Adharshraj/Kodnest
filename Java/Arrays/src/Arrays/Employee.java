package Arrays;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter no of Employees");
		int num= scan.nextInt();
		String arr[]=new String[num];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter name of Employee "+(i+1)+" : ");
			arr[i]=scan.nextLine();
		}
		System.out.println("Name of Employees are");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Name of Empolyee "+(i+1)+" = "+arr[i]);
		}

	}

}
