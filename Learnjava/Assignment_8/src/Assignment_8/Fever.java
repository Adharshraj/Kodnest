package Assignment_8;

import java.util.Scanner;

public class Fever {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Body Temperature in Fahrenheit");
		float Temp = scan.nextFloat();
		if(Temp >= 100.3)
		{
			System.out.println("Please Take Rest");
			if(Temp >= 103.0)
			{
				System.out.println("High Fever - Please Consult a Doctor");
			}
		}
		

	}

}
