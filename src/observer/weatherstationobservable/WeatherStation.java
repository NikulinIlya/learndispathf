package observer.weatherstationobservable;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(30, 65, 30.4f);
		weatherData.setMeasurements(32, 70, 29.2f);
		weatherData.setMeasurements(29, 90, 29.2f);
	}
}
