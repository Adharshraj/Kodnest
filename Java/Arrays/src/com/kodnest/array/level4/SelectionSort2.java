package com.kodnest.array.level4;

public class SelectionSort2 {

	public void SelectionSort(int arr[]) {
		for(int i=0;i<=arr.length-2;i++) {
			int min=arr[i];
			int pos = i;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[j]>min) {
					min=arr[j];
					pos=j;
				}

			}int a=arr[i];
			arr[i]=min;
			arr[pos]=a;

	}

}
}
