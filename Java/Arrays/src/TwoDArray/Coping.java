package TwoDArray;

import java.util.Scanner;

public class Coping {

	public static void main(String[] args) {
		int count=0;
		Scanner scan=new Scanner(System.in);
		int [][]arr= new int[scan.nextInt()][scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			count=0;
			for(int j=0;j<=arr[i].length-1;j++) {
				arr[i][j]=scan.nextInt();
				count++;
			}
			
		}
		int [][]arr1=new int[arr.length][count];
		System.out.println(count);
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr1[i].length-1;j++) {
				arr1[i][j]=arr[i][j];
			}
		}
		System.out.println("Array 1:");
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr1[i].length-1;j++) {
				System.out.print(arr1[i][j]+" ");
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
	}

}
