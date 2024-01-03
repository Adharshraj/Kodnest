package com.kodnest.array.level3;

public class BubbleSort {
	void bubblesort(int arr[]) {
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-2-i;j++) {
				if(arr[j]<arr[j+1]) {
					int a=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=a;
				}
			}
		}
	}

}
