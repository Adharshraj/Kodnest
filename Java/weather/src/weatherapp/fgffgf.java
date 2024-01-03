package weatherapp;

import java.util.Scanner;

public class fgffgf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
        String s = scan.nextLine();
        char arr[]=new char[s.length()];
        for(int i=0;i<=s.length()-1;i++){
            int n=s.charAt(i);
            if(n<97 || n>122 || n<65 || n>90 && s.charAt(i)!=' '){
                arr[i]=' ';
            }
            else{
                arr[i]=s.charAt(i);
            }
        }
        String str=new String(arr);
        String srr[]=str.split(" ");
        System.out.println(srr.length);
        for(String a:srr){
            System.out.println(a);
        }

	}

}
