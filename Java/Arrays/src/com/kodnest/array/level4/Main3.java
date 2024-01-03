package com.kodnest.array.level4;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter Array Elemets ");
		for(int i=0;i<=arr.length-1;i++)
		{
		arr[i]=scan.nextInt();
		}
		System.out.println("Before rotation array elements Are......");
		System.out.print("arr--> ");
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter number of times array has to be rotated");
		int n=scan.nextInt();
		RotateArray rot=new RotateArray();
		rot.RotateClock(arr, n);

	}

}
