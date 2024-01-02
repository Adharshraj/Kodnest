package TaxCalculator;

public class TaxCalc {
	public double CalcTax(double amount, double inter) {
		double Tax = amount * inter ;
		return amount + Tax;
	}

}
