package TemperatureConversion;

import java.util.Scanner;

public class TempConApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Select an option:");
		System.out.println("1. Convert Celsius to Fahrenheit");
		System.out.println("2. Convert Fahrenheit to Celsius");
		int Conver = scan.nextInt();
		
		switch(Conver)
		{
		case 1 :
			System.out.println("Enter the temperature in Celsius:");
			float temp = scan.nextFloat();
			System.out.println(temp+"°C is equivalent to "+TempCon.CelFahr(temp)+"°F");
			break;
		case 2:
			System.out.println("Enter the temperature in Fahrenheit:");
			temp = scan.nextFloat();
			System.out.println(temp+"6°F is equivalent to "+TempCon.FahrCel(temp)+"°C");
			break;
		default:
			System.err.println("You entered wrong input");
		}
	}

}
