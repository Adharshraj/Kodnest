package MergeElements;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array1");
		int []arr1=new int[scan.nextInt()];
		System.out.println("Enter length of array2");
		int []arr2=new int[scan.nextInt()];
		
		System.out.println("Enter elements of array1");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter elements of array2");
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i]=scan.nextInt();
		}
		int b=0;
		int []arr3=new int[arr1.length + arr2.length];
		for(int i=0;i<=arr3.length-1;i++) {
			if(i<=arr1.length-1) {
				arr3[i]=arr1[i];
			}
			else {
				arr3[i]=arr2[b];
				b++;
			}
		}
		/*for(int i=0;i<=arr3.length-1;i++) {
			System.out.print(arr3[i]+" ");
		}*/
		
		System.out.println(Arrays.toString(arr3));

	}

}
