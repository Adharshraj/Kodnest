package weatherapp;

import java.util.Scanner;

public class Amr {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Newclass nw=new Newclass();
		System.out.println("Array 1 length");
		long n=scan.nextLong();
		System.out.println("Array 2 length");
		long m=scan.nextLong();
		long arr1[]=new long[(int) n];
		long arr2[]=new long[(int) m];
		System.out.println("Enter elements in arrya 1");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter elements in arrya 2");
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i]=scan.nextInt();
		}
		System.out.println(nw.isSubset(arr1, arr2, n, m));
		
		

	}

}
