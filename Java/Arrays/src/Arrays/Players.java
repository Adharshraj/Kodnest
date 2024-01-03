package Arrays;

import java.util.Scanner;

public class Players {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter no of players");
		int num= scan.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter height of player "+(i+1)+" : ");
			arr[i]=scan.nextInt();
		}
		System.out.println("Height of players are");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Height of player "+(i+1)+" = "+arr[i]);
		}

	}

}
