package com.dmainali.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData {
    private double temperature;

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setMeasurements(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public double getTemperature() {
        return temperature;
    }

}
