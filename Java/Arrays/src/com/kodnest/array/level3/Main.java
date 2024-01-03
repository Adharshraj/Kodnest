package com.kodnest.array.level3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int []arr= new int[scan.nextInt()];
		int n=arr.length-1;
		System.out.println("Enter elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Before sorting : "+Arrays.toString(arr));
		new BubbleSort().bubblesort(arr);
		System.out.println("After sorting : "+Arrays.toString(arr));
	}

}
