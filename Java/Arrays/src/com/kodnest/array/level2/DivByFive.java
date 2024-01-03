package com.kodnest.array.level2;

import java.util.Scanner;

public class DivByFive {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
        int arr1[]=new int[scan.nextInt()];
        for(int i=0;i<=arr1.length-1;i++){
            arr1[i]=scan.nextInt();
        }
        int arr[]=new int[arr1.length/5];
        int b=0;
        for(int i=0;i<=arr1.length-1;i++) {
        	if(arr1[i]%5==0) {
        		arr[b]=arr1[i];
        		b++;
        	}
        }
        for(int i=0;i<=arr.length-1;i++) {
        	System.out.print( arr[i]+" ");
        	}
        }
	}

