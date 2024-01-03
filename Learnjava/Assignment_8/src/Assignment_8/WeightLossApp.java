package Assignment_8;

import java.util.Scanner;

public class WeightLossApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Body Weight in Kilogram");
		float Weight = scan.nextFloat();
		System.out.println("Enter Your Height in Meter");
		float Height = scan.nextFloat();
		float bmi = BmiCalculator(Weight, Height);
		if(bmi >= 25.0) {
			System.out.println("Your Bmi is "+bmi);
			if(bmi >= 31.0) {
				System.out.println("Obese - Please workout for 1hr/day and control your diet ");
			}
			else {
				System.out.println("OverWeight - Please workout for 30min/day");
			}
		}
		else {
			System.out.println("Good News - Your Body weight is Normal");
		}
		
		
		

	}
	public static float BmiCalculator(float Weight , float Height) {
		
		//float Bmi = Weight / (Height*Height);
		return Weight / (Height*Height);
		
	}

}
