package com.kodnest.array.level2;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
        int arr1[]=new int[scan.nextInt()];
        for(int i=0;i<=arr1.length-1;i++){
            arr1[i]=scan.nextInt();
        }
        for(int i=0;i<=arr1.length-1;i++) {
        	if(arr1[i]%2!=0) {
        		System.out.print(arr1[i]+" ");
        	}
        }

	}

}
