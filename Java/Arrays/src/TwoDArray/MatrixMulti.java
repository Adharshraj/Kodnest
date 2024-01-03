package TwoDArray;

import java.util.Scanner;

public class MatrixMulti {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Dimension of Matrix 1");
		int n=scan.nextInt();
		int m=scan.nextInt();
		int [][]arr= new int[n][m];
		System.out.println("Enter Dimension of Matrix 2");
		int p=scan.nextInt();
		int q=scan.nextInt();
		int [][]arr1= new int[p][q];
		System.out.println("Enter elements of Matrix 1");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				arr[i][j]=scan.nextInt();
			}

		}
		System.out.println("Enter elements of Matrix 2");
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr1[i].length-1;j++) {
				arr1[i][j]=scan.nextInt();
			}
		}
		int b;
		int c;
		if(m<n) {
			b=m;
		}
		else {
			b=n;
		}
		if(p<q) {
			c=q;
		}
		else {
			c=p;
		}
		
		int [][]arr2= new int[b][c];
		for (int i = 0; i < b; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < m; k++) {
                    arr2[i][j] += arr[i][k] * arr1[k][j];
                }
            }
        }
		System.out.println("Array 3:");
		for(int i=0;i<=arr2.length-1;i++) {
			for(int j=0;j<=arr2[i].length-1;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();

	}
	}

}
