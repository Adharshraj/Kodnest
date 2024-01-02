package TemperatureConversion;

public class TempCon {

	public static float FahrCel(float num1) {
		return (num1-32) * 5/9 ;
		
	}
	public static float CelFahr(float num1) {
		return (num1 * 9/5) + 32 ;
		
	}

}
