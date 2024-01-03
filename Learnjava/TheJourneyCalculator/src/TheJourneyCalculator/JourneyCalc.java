package TheJourneyCalculator;

import java.util.Scanner;

public class JourneyCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		JourneyCalculator journeyCalculator = new JourneyCalculator();
		System.out.println("Enter The speed and time to calculate distance");
		double speed =scan.nextDouble();
		double time = scan.nextDouble();
		System.out.println(journeyCalculator.calculateDistance(speed,time));
		scan.close();
		
	}

}
