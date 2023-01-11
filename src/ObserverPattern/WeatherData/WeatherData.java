package ObserverPattern.WeatherData;

import ObserverPattern.Display.IDisplay;

public class WeatherData {

    IDisplay[] displays;
    int temperature;
    int humidity;
    int pressure;


    public void changeWeatherData() {

    }

    public void publish() {
        for (IDisplay display: displays) {
            display.update();
        }
    }
}
