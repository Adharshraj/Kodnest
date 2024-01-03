package com.kodnest.array.level4;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int []arr= new int[scan.nextInt()];
		System.out.println("Enter elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("After sorting : "+Arrays.toString(arr));
		new InsertionSort().Insertionsort(arr);
		System.out.println("After sorting : "+Arrays.toString(arr));

	}

}
