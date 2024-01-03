package StringLevel1;

import java.util.Scanner;

public class svdfgdtget {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x=scan.nextInt();
		int y=scan.nextInt();
		Substraction sb=new Substraction(x,y);
		Addition ad=new Addition(x,y);
		
		Multiplication mt=new Multiplication(x,y);
		Division dv=new Division(x,y);
		
		sb.start();
		mt.start();
		dv.start();
		ad.start();
		System.out.println("Calculator Stopped");
        
}
}
		
	
	
	

