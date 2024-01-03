package JaggedArray;

import java.util.Scanner;

public class ScenarioPlayers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double [][]arr=new double[4][];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter no of playes in game"+i);
			int len=scan.nextInt();
			arr[i]= new double[len];
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter height of game "+i+" player "+j);
				arr[i][j]=scan.nextDouble();
			}
		}
		System.out.println("Array contents are...");
		for (int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();

	}

}
}
