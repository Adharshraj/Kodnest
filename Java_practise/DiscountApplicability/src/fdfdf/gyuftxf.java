package fdfdf;

import java.util.Scanner;

public class gyuftxf {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String ab=scan.next();
        if(ab.contains("+")){
            String ac[]=ab.split("\\+");
            int a=Integer.parseInt(ac[0]);
            int b=Integer.parseInt(ac[1]);
            int c=a+b;
            String d=Integer.toString(c);
            System.out.println(d);
        }
        else if(ab.contains("-")){
            String ac[]=ab.split("-");
            int a=Integer.parseInt(ac[0]);
            int b=Integer.parseInt(ac[1]);
            int c=a-b;
            String d=Integer.toString(c);
            System.out.println(d);
        }
        else if(ab.contains("*")){
            String ac[]=ab.split("\\*");
            int a=Integer.parseInt(ac[0]);
            int b=Integer.parseInt(ac[1]);
            int c=a*b;
            String d=Integer.toString(c);
            System.out.println(d);
        }
        else if(ab.contains("/")){
            String ac[]=ab.split("/");
            int a=Integer.parseInt(ac[0]);
            int b=Integer.parseInt(ac[1]);
            int c=a/b;
            String d=Integer.toString(c);
            System.out.println(d);
        }

	}

}
