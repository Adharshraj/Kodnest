package StringLevel1;

import java.util.Scanner;

public class LongestUni {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter String");
		String str=scan.nextLine();
		String res=LongestSeq(str);
		String arr[]=res.split(" ");
		int b=0;
		int ind=0;
		for(int i=0;i<=arr.length-1;i++) {
			int a=arr[i].length();
			if(a>b) {
				ind=i;
			}
			b=a;
		}
		String c=arr[ind];
		System.out.println(c);

	}
	public static String LongestSeq(String str) {
		String sb=new String();
		for(int i=0;i<=str.length()-1;i++) {
			for(int j=i+1;j<=str.length();j++) {
				if(Unique(str.substring(i, j))==true) {
					sb=sb+MaxorNot(str.subSequence(i, j).toString())+" ";
					System.out.println(str.subSequence(i, j).toString());
				}
			}
		}
		return sb;
	}
	public static String MaxorNot(String ab) {
		StringBuffer ad=new StringBuffer();
		if(ab.length() > ad.length()) {
			ad=new StringBuffer(ab);
			return ab;
		}
		else {
			return ad.toString();
		}
	}
	public static boolean Unique(String str) {
		for(int i=0;i<=str.length()-1;i++) {
			char a=str.charAt(i);
			if(str.contains(String.valueOf(a))==true;
		}
	}
	
}
