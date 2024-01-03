package ThreeDArray;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean [][][]arr=new boolean[scan.nextInt()][scan.nextInt()][scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					arr[i][j][k]=scan.nextBoolean();
				}
			}
		}
		System.out.println("Student marks");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Class"+(i+1)+":");
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.println("Student "+(k+1)+": "+arr[i][j][k]);
				}
			}
		}

	}

}
