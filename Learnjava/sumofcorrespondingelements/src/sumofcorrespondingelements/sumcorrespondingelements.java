package sumofcorrespondingelements;

import java.util.Arrays;
import java.util.Scanner;

public class sumcorrespondingelements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int len=scan.nextInt();
		int []arr1=new int[len];
		int []arr2=new int[len];
		System.out.println("Enter elements of array1");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter elements of array2");
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i]=scan.nextInt();
		}
		int []arr3=new int[len];
		for(int i=0;i<=arr3.length-1;i++) {
				arr3[i]=arr1[i]+arr2[i];
			}
		System.out.println(Arrays.toString(arr3));
		}
	

	}


