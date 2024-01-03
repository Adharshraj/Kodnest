package weatherapp;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
        String apiKey = "1d324e3bf8faa5eabe6c98744e8b5f3f"; // Replace with your OpenWeatherMap API key
        System.out.println("Enter city name");
        String city = scan.next(); // Replace with the desired city name

        try {
            String weatherData = getWeatherData(apiKey, city);
            parseWeatherData(weatherData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getWeatherData(String apiKey, String city) throws IOException {
        String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }

        reader.close();
        connection.disconnect();

        return response.toString();
    }

    private static void parseWeatherData(String weatherData) {
        try {
            JSONObject json = new JSONObject(weatherData);

            JSONArray weatherArray = json.getJSONArray("weather");
            JSONObject weather = weatherArray.getJSONObject(0);
            String description = weather.getString("description");

            JSONObject main = json.getJSONObject("main");
            double temperature = main.getDouble("temp");
            double pressure=main.getDouble("pressure");
            double humidity=main.getDouble("humidity");

            System.out.println("Weather Description: " + description);
            System.out.println("Temperature: " + (temperature-273.15) + " Kelvin");
            System.out.println("Humidity: "+humidity);
            System.out.println("Pressure: "+pressure);
        } catch (JSONException e) {
            e.printStackTrace();
            System.err.println("Error parsing JSON data.");
        }
    }

}
