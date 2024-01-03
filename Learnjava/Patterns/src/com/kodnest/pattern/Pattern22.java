package com.kodnest.pattern;

public class Pattern22 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			if(i<=5) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int l=5;l>=i;l--) {
				System.out.print("*");
			}
			}
			else {
				for(int k=5;k<=i;k++) {
					System.out.print(" ");
				}
				for(int m=5;m<=i;m++) {
					System.out.print("*");
				}
			}
			System.out.println();
		
	}

	}

}
