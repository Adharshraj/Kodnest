package TheDoubleTroble;

import java.util.Scanner;

public class doubleTheNumber {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number needed to be25 doubled");
		int num = scan.nextInt();
		System.out.println("The Result is = "+doubleTheNumber(num));
		scan.close();

	}
	public static int doubleTheNumber(int num)
	{
		return 2 * num;
	}

}
