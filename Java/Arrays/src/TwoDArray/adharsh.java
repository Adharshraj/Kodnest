package TwoDArray;

import java.util.Scanner;

public class adharsh {
	    public static void main(String[] args) {
	    	Scanner scan=new Scanner(System.in);
	    	System.out.println("Enter data");
	        int n = scan.nextInt(); // Number of rows in the pyramid

	        for (int i = 1; i < n; i++) {
	            // Print spaces before the letters
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            // Print letters in increasing order
	            for (int j = 1; j <= i; j++) {
	                char letter = (char) ('A' + j - 1);
	                System.out.print(letter);
	            }

	            // Print letters in decreasing order
	            for (int j = i-1 ; j >= 1; j--) {
	                char letter = (char) ('A' + j - 1);
	                System.out.print(letter);
	            }

	            // Move to the next line
	            System.out.println();
	        }
	    }
	}



