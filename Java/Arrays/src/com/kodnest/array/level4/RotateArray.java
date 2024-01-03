package com.kodnest.array.level4;

public class RotateArray {
	void RotateClock(int arr[],int co) {
		for(int count=1;count<=co;count++)
		{
		int temp=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--)
		{
		arr[i+1]=arr[i];
		}
		arr[0]=temp;
		}
		System.out.println();
		System.out.println("After rotation array elements Are......");
		System.out.print("arr--> ");
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.print(arr[i]+" ");
		}
		}
	}


