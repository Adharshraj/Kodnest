package TheTemperatureConverter;

import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the fahrenheit value needs to converted");
		double fahrenheit = scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter(); 
		//double Celsius = temperatureConverter.convertFahrenheitToCelsius(fahrenheit);
		System.out.println(temperatureConverter.convertFahrenheitToCelsius(fahrenheit)); 
		
		

	}

}
