package com.kodnest.pattern;

public class Pattern20 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			if(i<=5) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int l=1;l<=i;l++) {
				System.out.print("*");
			}
			}
			else {
				for(int k=9;k>=i;k--) {
					System.out.print(" ");
				}
				for(int m=9;m>=i;m--) {
					System.out.print("*");
				}
			}
			System.out.println();
		
	}

	}

}
