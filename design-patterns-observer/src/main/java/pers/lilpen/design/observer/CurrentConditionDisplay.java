package pers.lilpen.design.observer;

import pers.lilpen.design.observable.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: phs
 * @description: TODO
 * @date: 2024/7/13 21:33
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
        }
    }

    @Override
    public void display() {
        System.out.println("temperature: " + temperature + "\n" + "humidity: " + humidity);
    }
}
