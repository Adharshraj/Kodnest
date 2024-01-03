package com.kodnest.pattern;

public class Pattern23 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			if(i<=5) {
			for(int j=1;j<=5;j++) {
				System.out.print(" ");
			}
			for(int l=5;l>=i;l--) {
				System.out.print("*");
			}
			}
			else {
				for(int k=1;k<=5;k++) {
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
