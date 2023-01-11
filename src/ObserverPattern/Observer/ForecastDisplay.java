package ObserverPattern.Observer;

import ObserverPattern.Subject.WeatherData;

public class ForecastDisplay implements IObserver, IDisplay {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {

    }

    @Override
    public void update(int temperature, int humidity, int pressure) {
        lastPressure = this.currentPressure;
        currentPressure = pressure;
        display();
    }
}
