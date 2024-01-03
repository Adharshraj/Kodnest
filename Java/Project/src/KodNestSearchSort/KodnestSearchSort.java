package KodNestSearchSort;

import java.util.Arrays;

public class KodnestSearchSort {
	int linearSearch(int arr[],int key)
	{
		boolean flag=false;
		for(int i=0;i<=arr.length-1;i++) {
			if(key==arr[i]) {
				flag=true;
				return i;
			}
		}
		if(flag==false) {
			return -1;
		}
		return -1;
	}
	int binarySearch(int arr[],int key)
	{
		new KodnestSearchSort().bubbleSortDescending(arr);
		System.out.println("Sorted array for binarySearch"+Arrays.toString(arr));
		int low=0;
		int high=arr.length-1;
		boolean flag=false;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==arr[mid])
			{
				flag=true;
				return mid;
			}
			else if(key<arr[mid])
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		if(flag==false) {
		return -1;
		}
		return 0;
		}

	void bubbleSortAscending(int arr[])
	{
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-2-i;j++) {
				if(arr[j]>arr[j+1]) {
					int a=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=a;
				}
			}
		}
	}
	void bubbleSortDescending(int arr[])
	{
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
	void selectionSortAscending(int arr[])
	{
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
		

	}
	void selectionSortDescending(int arr[])
	{
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

	void insertionSortAscending(int arr[])
	{
		for(int i=1;i<=arr.length-1;i++)
		{
		int item=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>item)
		{
		arr[j+1]=arr[j];
		j--;
		}
		arr[j+1]=item;
		}
		
		
		
	}
	void insertionSortDescending(int arr[])
	{
		for(int i=1;i<=arr.length-1;i++)
		{
		int item=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]<item)
		{
		arr[j+1]=arr[j];
		j--;
		}
		arr[j+1]=item;
		}
		
		
	}
	int findMinimum(int arr[])
	{
		new KodnestSearchSort().bubbleSortAscending(arr);
		return arr[0];
	}
	int findMax(int arr[])
	{
		new KodnestSearchSort().bubbleSortDescending(arr);
		return arr[0];
	}
}



