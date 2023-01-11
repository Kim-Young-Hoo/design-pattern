package ObserverPattern.Observer;

import ObserverPattern.Subject.WeatherData;

public class StatisticsWeatherDisplay implements IObserver, IDisplay {
    int temperature;
    int humidity;
    int pressure;
    private WeatherData weatherData;

    public StatisticsWeatherDisplay(WeatherData weatherData) {
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
        System.out.println("평균 온도는 : " + this.temperature);
        System.out.println("평균 습도는 : " + this.humidity);
        System.out.println("평균 기압은 : " + this.pressure);

    }
}
