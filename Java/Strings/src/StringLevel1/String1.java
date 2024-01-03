package StringLevel1;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		int n=s1.length();
		char []arr=new char[n];
		for(int i=0;i<=n-1;i++) {
			arr[i]=s1.charAt(i);
		}
		/*for(int i=0;i<=n-1;i++) {
			System.out.println(arr[i]);
		}*/
		for(char x : arr) {
			System.out.println(x);

	}
	}

}
