package RotateTheElement;

import java.util.Arrays;
import java.util.Scanner;

public class RotateTheArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array1");
		int []arr1=new int[scan.nextInt()];
		System.out.println("Enter No of Rotations");
		int rot=scan.nextInt();
		int []arr2=new int[arr1.length];
		System.out.println("Enter elements of array1");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();
			}
		int b=0;
		int c=0;
		int d=1;
		for(int i=1;i<=rot;i++) {
			b=i;
			c=i;
			d=i;
			for(int j=0;j<=arr1.length-1;j++) {
				if((b<arr1.length)) {
					arr2[b]=arr1[j];
					b++;
				}
				else {
					arr2[d-c]=arr1[j];
					c--;
				}
			}
			System.out.println(i+" :"+Arrays.toString(arr2));
		}
	}
}
