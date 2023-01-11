package ObserverPattern;

import ObserverPattern.Observer.CurrentWeatherDisplay;
import ObserverPattern.Observer.HeatIndexDisplay;
import ObserverPattern.Observer.PredictWeatherDisplay;
import ObserverPattern.Observer.StatisticsWeatherDisplay;
import ObserverPattern.Subject.WeatherData;

public class RunObserverPattern {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentWeatherDisplay currentWeatherDisplay = new CurrentWeatherDisplay(weatherData);
        PredictWeatherDisplay predictWeatherDisplay = new PredictWeatherDisplay(weatherData);
        StatisticsWeatherDisplay statisticsWeatherDisplay = new StatisticsWeatherDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurement(30, 60, 70);
        System.out.println(" ");
        weatherData.setMeasurement(40, 60, 70);

    }
}
