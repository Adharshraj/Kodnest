package StringLevel1;

import java.util.Scanner;

public class StringIrregu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String str=input.toLowerCase();
		String arr[]=str.split(" ");
		String sb="";
		for(int i=arr.length-1;i>=0;i--) {
			sb=sb+arr[i]+" ";
		}
		System.out.println(sb);
		char arr1[]=sb.toCharArray();
		for(int i=0;i<=arr1.length-1;i++) {
			if(arr1[i]=='h') {
				arr1[i]='H';
			}
		}
		String str1=new String(arr1);
		System.out.println(str1);

	}

}
