package TwoDArray;

import java.util.Scanner;

public class Mult2DArray {

	public static void main(String[] args) {
		int count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=scan.nextInt();
		int m=scan.nextInt();
		int [][]arr= new int[n][m];
		System.out.println("Enter elements of array1");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				arr[i][j]=scan.nextInt();
			}
			
		}
		int [][]arr1=new int[n][m];
		System.out.println("Enter elements of array2");
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr1[i].length-1;j++) {
				arr1[i][j]=scan.nextInt();
			}
		}
		int [][]arr2=new int[n][m];
		for(int i=0;i<=arr2.length-1;i++) {
			for(int j=0;j<=arr2[i].length-1;j++) {
				arr2[i][j]=arr[i][j] * arr1[i][j];
			}
		}
		System.out.println("Array 1:");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Array 2:");
		
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr1[i].length-1;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();

	}
		System.out.println("Array 3:");
		for(int i=0;i<=arr2.length-1;i++) {
			for(int j=0;j<=arr2[i].length-1;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();

	}
	}

	}


