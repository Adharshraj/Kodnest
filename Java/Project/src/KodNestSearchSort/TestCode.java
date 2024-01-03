package KodNestSearchSort;

import java.util.Arrays;
import java.util.Scanner;

public class TestCode {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter array length");
			int []arr= new int[scan.nextInt()];
			System.out.println("Enter elements");
			for(int i=0;i<=arr.length-1;i++) {
				arr[i]=scan.nextInt();
			}
			while(true) {
				System.out.println("Enter 1 for Searching");
				System.out.println("Enter 2 for Sorting");
				System.out.println("Enter 3 for find max and min");
				int choice=scan.nextInt();
				switch(choice) {
				case 1:System.out.println("Enter 1 for linearSearch");
				System.out.println("Enter 2 for BinarySearch");
				int choice1=scan.nextInt();
				KodnestSearchSort app=new KodnestSearchSort ();
				if(choice1==1) {
					System.out.println("Enter key to Search");
					int key=scan.nextInt();
					System.out.println("Key found at index of : "+app.linearSearch(arr, key));
				}
				else if(choice1==2) {
					System.out.println("Enter key to Search");
					int key=scan.nextInt();
					System.out.println("Key found at index of : "+new KodnestSearchSort().binarySearch(arr, key));
				}
				else {
					System.out.println("Go to eye care");
				}
				break;
				case 2:System.out.println("Enter 1 for bubble sort");
				System.out.println("Enter 2 for selection sort");
				System.out.println("Enter 3 for insertion sort");
				int choice2=scan.nextInt();
				if(choice2==1) {
					System.out.println("Enter 1 for ascendingsort 2 for descending sort");
					int num=scan.nextInt();
					if(num==1) {
						new KodnestSearchSort().bubbleSortAscending(arr);
						System.out.println(Arrays.toString(arr));
					}
					else if(num==2) {
						new KodnestSearchSort().bubbleSortDescending(arr);
						System.out.println(Arrays.toString(arr));
					}
					else {
						System.out.println("go to eye care");
					}
				}
				else if(choice2==2) {
					System.out.println("Enter 1 for ascendingsort 2 for descending sort");
					int num=scan.nextInt();
					if(num==1) {
						new KodnestSearchSort().selectionSortAscending(arr);
						System.out.println(Arrays.toString(arr));
					}
					else if(num==2) {
						new KodnestSearchSort().selectionSortDescending(arr);
						System.out.println(Arrays.toString(arr));
					}
					else {
						System.out.println("go to eye care");
					}
				}
				else if(choice2==3) {
					System.out.println("Enter 1 for ascendingsort 2 for descending sort");
					int num=scan.nextInt();
					if(num==1) {
						new KodnestSearchSort().insertionSortAscending(arr);
						System.out.println(Arrays.toString(arr));
					}
					else if(num==2) {
						new KodnestSearchSort().insertionSortDescending(arr);
						System.out.println(Arrays.toString(arr));
					}
					else {
						System.out.println("go to eye care");
					}
				}
				else {
					System.out.println("go to eye care");
				}
				break;
				case 3:System.out.println("Enter 1 for find max 2 for find min");
				int num=scan.nextInt();
				if(num==1) {
					int res=new KodnestSearchSort().findMax(arr);
					System.out.println(res);
				}
				else if(num==2) {
					int res=new KodnestSearchSort().findMinimum(arr);
					System.out.println(res);
				}
				else {
					System.out.println("go to eye care");
				}
				break;
				default:
					System.out.println("go to eye care");
				}
			}

	}

}
