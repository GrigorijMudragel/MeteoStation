package mudragel.grigorij.study.designpatterns.observer;

public class WeatherStation {

    public static void main(String[] args) {
	    WeatherData weatherData = new WeatherData();

	    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        HeatIndexDisplay heatDisplay = new HeatIndexDisplay(weatherData);

	    weatherData.setNeasurements(80, 65 , 30.4f);
        weatherData.setNeasurements(82, 70 , 29.2f);
        weatherData.setNeasurements(78, 90 , 29.2f);


    }
}
