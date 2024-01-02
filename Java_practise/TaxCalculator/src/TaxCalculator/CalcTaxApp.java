package TaxCalculator;

import java.util.Scanner;

public class CalcTaxApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the purchase amount: ");
		double amount = scan.nextDouble();
		System.out.println("Enter the tax rate (in decimal form): ");
		double inter = scan.nextDouble();
		TaxCalc taxcal = new TaxCalc();
		System.out.println("Total cost including tax: "+taxcal.CalcTax(amount, inter));

	}

}
