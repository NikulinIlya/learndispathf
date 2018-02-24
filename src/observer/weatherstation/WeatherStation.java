package observer.weatherstation;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastsDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(30,65,30.5f);
        weatherData.setMeasurements(32,70,29.2f);
        weatherData.setMeasurements(29,90,29.2f);
    }
}
