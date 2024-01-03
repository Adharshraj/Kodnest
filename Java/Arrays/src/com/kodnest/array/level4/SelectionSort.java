package com.kodnest.array.level4;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int []arr= new int[scan.nextInt()];
		System.out.println("Enter elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("After sorting : "+Arrays.toString(arr));
		for(int i=0;i<=arr.length-2;i++) {
			int min=arr[i];
			int pos = i;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[j]<min) {
					min=arr[j];
					pos=j;
				}

			}int a=arr[i];
			arr[i]=min;
			arr[pos]=a;
		}
		System.out.println("After sorting : "+Arrays.toString(arr));
	}

}
