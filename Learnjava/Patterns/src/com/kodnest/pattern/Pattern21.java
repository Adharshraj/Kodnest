package com.kodnest.pattern;

public class Pattern21 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			if(i<=5) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int l=1;l<=5;l++) {
				System.out.print("*");
			}
			}
			else {
				for(int k=9;k>=i;k--) {
					System.out.print(" ");
				}
				for(int m=9;m>=5;m--) {
					System.out.print("*");
				}
			}
			System.out.println();
		
	}

	}

}
