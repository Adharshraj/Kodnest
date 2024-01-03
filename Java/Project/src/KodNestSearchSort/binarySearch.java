package KodNestSearchSort;

import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[] = new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			//System.out.println("Enter an element");
			arr[i]=scan.nextInt();
		}
		System.out.println("Array elements are......");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");

	}
		
	}

}
