package StringLevel1;

import java.util.Scanner;

public class sdsfgs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter s String");
        String s = scan.nextLine();
        char arr[]=new char[s.length()];
        for(int i=0;i<=s.length()-1;i++){
            int n=(int)s.charAt(i);
            if(n>=97 && n<=122 || n>=65 && n<=90 || s.charAt(i)==' '){
            	arr[i]=s.charAt(i);
                
            }
            else{
            	arr[i]=' ';
            }
        }
        String str=new String(arr);
        String srr[]=str.split(" ");
        int count=0;
        for(String a:srr){
        	if(a=="") {
        		count++;
        	}
        }
        System.out.println(srr.length-count);
        for(String a:srr){
        	if(a!="") {
            System.out.println(a);
        	}
        }

	}

}
