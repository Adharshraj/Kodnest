package ArrayList;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int arr[][]=new int[n][m];
		int a=n*m;
		int arr1[]=new int[a];
		arr1[0]=0;
		int temp=1;
		for(int i=1;i<=arr1.length-1;i++) {
			arr1[i]=temp;
			temp=arr1[i]+arr1[i-1];
		}
		int StC=0;int StR=0;int SpC=n-1;int SpR=m-1;
		int Dir=0;
		while(SpC>=0 & SpR>=0 ) {
			
		}

	}

}
