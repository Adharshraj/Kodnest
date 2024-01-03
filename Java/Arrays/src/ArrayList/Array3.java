package ArrayList;

import java.util.*;

public class Array3 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		String arr[]=new String[3];
		Scanner Scan=new Scanner(System.in);
		arr[0]="Roll No";
		arr[1]="Name";
		arr[2]="Percentage";
	
		System.out.println("Enter your "+arr[0]);
		al.add(Scan.nextInt());
		System.out.println("Enter your "+arr[1]);
		al.add(Scan.next());
		System.out.println("Enter your "+arr[2]);
		al.add(Scan.nextFloat());
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]+" = "+al.get(i));
		}
		

	}

}
