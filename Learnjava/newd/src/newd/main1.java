package newd;

import java.util.Scanner;

public class main1 {

	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            series(a, b, n);
	        }
	        
	        in.close();
	    }
	    public static void series(int a, int b, int c){
	        int sum=0;
	        for(int i=0;i<c;i++){
	            for(int j=0;j<=i;j++){
	                double res=Math.pow(2,i)*b;
	                sum+=res;
	            }
	            int res1=a+sum;
	            System.out.print(res1+" ");
	        }
	        System.out.println();
	    }
	}

