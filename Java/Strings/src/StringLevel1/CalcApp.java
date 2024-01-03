package StringLevel1;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int x=scan.nextInt();
		int y=scan.nextInt();
		Substraction sb=new Substraction(x,y);
		Addition ad=new Addition(x,y);
		Multiplication mt=new Multiplication(x,y);
		Division dv=new Division(x,y);
		Thread t1=new Thread(ad);
		Thread t2=new Thread(sb);
		Thread t3=new Thread(mt);
		Thread t4=new Thread(dv);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println("Calculator Stopped");
        
}

	}


