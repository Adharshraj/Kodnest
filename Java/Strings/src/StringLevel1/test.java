package StringLevel1;

import java.util.Locale;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int a=scanner.nextInt();
	        int b=scanner.nextInt();
	        int c=scanner.nextInt();
	        boolean res=isTriangleValid(a,b,c);
	        if(res==true) {
	        	System.out.println("Valid Triangle");
	        }
	        else {
	        	System.out.println("invalid Triangle");
	        }
	        }
	    public static boolean isTriangleValid(int a, int b, int c) {
	        return a+b>  c && a+c >b && b+c > a ;
	    }

}
