package ObserverPattern.Observer;

import ObserverPattern.Subject.WeatherData;

public class PredictWeatherDisplay implements IObserver, IDisplay {
    int temperature;
    int humidity;
    int pressure;
    private WeatherData weatherData;

    public PredictWeatherDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }

    @Override
    public void display() {
        System.out.println("예상 온도는 : " + (this.temperature + 2));
        System.out.println("예상 습도는 : " + (this.humidity + 10));
        System.out.println("예상 기압은 : " + (this.pressure + 100));

    }
}
