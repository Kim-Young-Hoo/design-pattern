package ObserverPattern.Subject;

import ObserverPattern.Observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject {

    private List<IObserver> observers;
    private int temperature;
    private int humidity;
    private int pressure;

    public WeatherData() {
        this.observers = new ArrayList<IObserver>();
    }


    public void setMeasurement(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementChanged();
    }

    public void measurementChanged() {
        this.notifyObserver();
    }

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver observer : observers) {
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }
}
