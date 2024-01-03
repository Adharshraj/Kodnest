package com.kodnest.pattern;

public class Pattern24 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i==1 || i==5) {
			for(int j=1;j<=5;j++) {
			System.out.print("*");
			}
			}
			else {
				System.out.print("*");
				for(int k=1;k<=3;k++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
