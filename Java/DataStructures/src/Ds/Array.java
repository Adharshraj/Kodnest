package Ds;

import java.util.Scanner;

public class Array {
	private int arr[]=null;
	private Scanner scan=new Scanner(System.in);
	public Array(int a) {
		arr=new int[a];
	}
	public void insert() {
		System.out.println("Enter the elements from 0 to "+(arr.length-1));
		int pos=scan.nextInt();
		System.out.println("Enter the value");
		int val=scan.nextInt();
		arr[pos]=val;
	}
	public void delete() {
		System.out.println("Enter the elements from 0 to "+(arr.length-1));
		int pos=scan.nextInt();
		arr[pos]=0;
	}
	public void display() {
		for(int i :arr) {
			System.out.println(i);
		}
	}

}
