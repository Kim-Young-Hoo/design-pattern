package ObserverPattern.Observer;

import ObserverPattern.Subject.WeatherData;

public class CurrentWeatherDisplay implements IObserver, IDisplay {

    int temperature;
    int humidity;
    int pressure;
    private WeatherData weatherData;

    public CurrentWeatherDisplay(WeatherData weatherData) {
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
        System.out.println("지금 온도는 : " + this.temperature);
        System.out.println("지금 습도는 : " + this.humidity);
        System.out.println("지금 기압은 : " + this.pressure);
    }
}
